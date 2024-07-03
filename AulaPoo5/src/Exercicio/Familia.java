package Exercicio;

public class Familia {
    private String nome;
    private Ordem ordem;

    public Familia(String nome, Ordem ordem) {
        this.nome = nome;
        this.ordem = ordem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ordem getOrdem() {
        return ordem;
    }

    public void setOrdem(Ordem ordem) {
        this.ordem = ordem;
    }
}
