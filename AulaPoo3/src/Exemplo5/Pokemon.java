package Exemplo5;

import java.util.ArrayList;

public class Pokemon {
    String nome;
    Tipo tipo;
    ArrayList<Habilidade> listaDeHabilidades;

    public Pokemon(String nome, Tipo tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.listaDeHabilidades = new ArrayList<>();
    }

    public Pokemon(String nome, Tipo tipo, ArrayList<Habilidade> listaDeHabilidades) {
        this.nome = nome;
        this.tipo = tipo;
        this.listaDeHabilidades = listaDeHabilidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Habilidade> getListaDeHabilidades() {
        return listaDeHabilidades;
    }

    public void addHabilidade(Habilidade habilidade) {
        this.listaDeHabilidades.add(habilidade);
    }
}
