package Exercicio.seres;

import Exercicio.*;

public class Fungo extends SerVivo {
    public Fungo() {
    }

    public Fungo(String nomeCientifico, Reino reino, Filo filo, Classe classe, Ordem ordem, Familia familia, Genero genero, Especie especie) {
        super(nomeCientifico, reino, filo, classe, ordem, familia, genero, especie);
    }

    @Override
    public void comer() {
        System.out.println("Fungo está comendo");
    }

    @Override
    public void movimentar() {
        System.out.println("Fungo está se movimentando");
    }

    @Override
    public void reproduzir() {
        System.out.println("Fungo está se reproduzindo");
    }
}
