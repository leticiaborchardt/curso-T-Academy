package Exercicio;

public class Classe {
    private String nome;
    private Filo filo;

    public Classe(String nome, Filo filo) {
        this.nome = nome;
        this.filo = filo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Filo getFilo() {
        return filo;
    }

    public void setFilo(Filo filo) {
        this.filo = filo;
    }
}
