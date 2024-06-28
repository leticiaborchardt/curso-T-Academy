package Exercicio8;

import java.time.LocalDate;
import java.time.Period;

public class Jogador {

    private String nome;
    private PosicaoDeJogo posicao;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public Jogador() {}

    public Jogador(String nome, PosicaoDeJogo posicao, LocalDate dataNascimento, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public void imprimirDados() {
        System.out.println(this);
        System.out.println("Tempo restante até se aposentar: " + this.calcularAposentadoria() + " ano(s)");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PosicaoDeJogo getPosicao() {
        return posicao;
    }

    public void setPosicao(PosicaoDeJogo posicao) {
        this.posicao = posicao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return Period.between(this.getDataNascimento(), LocalDate.now()).getYears();
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcularAposentadoria() {
        int idade = this.getIdade();

        switch (this.getPosicao()) {
            case ATACANTE:
                return Math.max(35 - idade, 0);
            case DEFESA:
                return Math.max(40 - idade, 0);
            case MEIO_CAMPO:
                return Math.max(38 - idade, 0);
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\n" +
                "Posição: " + this.getPosicao().getDescricao() + "\n" +
                "Data Nascimento: " + this.getDataNascimento() + "\n" +
                "Idade: " + this.getIdade() + "\n" +
                "Nacionalidade: " + this.getNacionalidade() + "\n" +
                "Altura: " + this.getAltura() + "\n" +
                "Peso: " + this.getPeso();
    }
}

