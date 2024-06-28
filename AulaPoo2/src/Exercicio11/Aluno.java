package Exercicio11;

public class Aluno {
    private String matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    public Aluno() {}

    public Aluno(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double getMedia() {
        return this.calcularMedia();
    }

    private double calcularMedia() {
        return (notaProva1 + notaProva2 + notaTrabalho) / 3;
    }

    private String verificarSituacao() {
        return this.getMedia() >= 6 ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\n" +
                "Matrícula: " + this.getMatricula() + "\n" +
                "Média: " + this.getMedia() + "\n" +
                "Situação: " + this.verificarSituacao();
    }
}
