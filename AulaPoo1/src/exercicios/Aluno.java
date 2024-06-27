package exercicios;

import java.util.Scanner;

public class Aluno {
    public String nome;
    public int idade;
    public String turma;
    private String matricula;
    private double media;

    public Aluno() {}

    public Aluno(String nome, int idade, String turma, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Turma: " + this.turma);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Situação: " + (this.isAprovado() ? "Aprovado" : "Reprovado"));
    }

    public Aluno cadastrar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        this.nome = scan.next();

        System.out.println("Digite a idade do aluno: ");
        this.idade = scan.nextInt();

        System.out.println("Digite a turma do aluno: ");
        this.turma = scan.next();

        System.out.println("Digite a matrícula do aluno: ");
        this.matricula = scan.next();

        return this;
    }

    private boolean isAprovado() {
        return this.media >= 6;
    }
}
