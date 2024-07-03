package Exercicio;

public class Filo {
    private String nome;
    private Reino reino;

    public Filo(String nome, Reino reino) {
        this.nome = nome;
        this.reino = reino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Reino getReino() {
        return reino;
    }

    public void setReino(Reino reino) {
        this.reino = reino;
    }
}
