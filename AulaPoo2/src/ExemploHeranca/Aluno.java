package ExemploHeranca;

import java.time.LocalDate;

public class Aluno extends Pessoa {
    public int matricula;
    public double[] notas = new double[4];
    public String turma;

    public Aluno(int matricula, double[] notas, String turma) {
        this.matricula = matricula;
        this.notas = notas;
        this.turma = turma;
    }

    public Aluno(String nome, String cpf, LocalDate dataNascimento, int matricula, double[] notas, String turma) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
        this.notas = notas;
        this.turma = turma;
    }
}
