import CorrecaoExAluno.Aluno;
import CorrecaoExAluno.GerenciadorAlunos;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        System.out.println("Alunos cadastrados");
        for (Map.Entry<String, Aluno> aluno : gerenciadorAlunos.getAlunos().entrySet()) {
            System.out.println(aluno.getValue().toString());
        }

        System.out.println(gerenciadorAlunos.getNotaAluno("Alastor"));
    }
}