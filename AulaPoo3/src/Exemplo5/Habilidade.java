package Exemplo5;

public class Habilidade {
    private String nome;
    private int dano;
    private Tipo tipo;

    public Habilidade(String nome, int dano, Tipo tipo) {
        this.nome = nome;
        this.dano = dano;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
