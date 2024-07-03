package Exercicio;

public class Genero {
    private String nome;
    private Familia familia;

    public Genero(String nome, Familia familia) {
        this.nome = nome;
        this.familia = familia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }
}
