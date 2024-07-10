package CorrecaoExAluno;

import java.util.*;
import java.util.stream.Collectors;

public class GerenciadorAlunos {
    private Map<String, Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashMap<String, Aluno>();

        alunos.put("Alastor", new Aluno("Alastor", 86.3));
        alunos.put("Morty", new Aluno("Morty", 20));
        alunos.put("Agnes", new Aluno("Agnes", 61.7));
        alunos.put("Clotilde", new Aluno("Clotilde", 100));
        alunos.put("Horácio", new Aluno("Horácio", 42.94));
    }

    public String getNotaAluno(String nome) {
        Aluno aluno = alunos.get(nome);

        return aluno != null ? "Nota de " + nome + ": " + aluno.getNota() : "Aluno não encontrado.";
    }

    public List<String> filtrarAlunosPorNota(double notaMinima) {
        return alunos.values().stream()
                .filter(aluno -> aluno.getNota() > notaMinima)
                .map(Aluno::getNome)
                .toList();
    }

    public List<Aluno> removerAlunosPorNota(double notaMinima) {
        List<Aluno> removidos = new ArrayList<>();

        this.alunos.values().removeIf(aluno -> {
            if (aluno.getNota() < notaMinima) {
                removidos.add(aluno);
                return true;
            }

            return false;
        });

        return removidos;
    }

    public Map<String, Aluno> classificarAlunosPorNota() {
        Map<String, Aluno> alunosOrdenados = new LinkedHashMap<>();

        alunos.entrySet().stream()
                .sorted((e1, e2) -> Double.compare(e1.getValue().getNota(), e2.getValue().getNota()))
                .forEach(aluno -> alunosOrdenados.put(aluno.getKey(), aluno.getValue()));

        return alunosOrdenados;
    }

    public Map<String, List<Aluno>> agruparAlunosPorNota() {
        return this.alunos.values().stream().collect(Collectors.groupingBy(aluno -> {
            if (aluno.getNota() >= 90) return "A";
            else if (aluno.getNota() >= 80) return "B";
            else if (aluno.getNota() >= 70) return "C";
            else if (aluno.getNota() >= 60) return "D";
            else return "F";
        }));
    }

    public Map<String, Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Map<String, Aluno> alunos) {
        this.alunos = alunos;
    }
}
