package Exercicio.seres;

import Exercicio.*;

public class Planta extends SerVivo {
    public Planta() {
    }

    public Planta(String nomeCientifico, Reino reino, Filo filo, Classe classe, Ordem ordem, Familia familia, Genero genero, Especie especie) {
        super(nomeCientifico, reino, filo, classe, ordem, familia, genero, especie);
    }

    @Override
    public void comer() {
        System.out.println("Planta está comendo");
    }

    @Override
    public void movimentar() {
        System.out.println("Planta não consegue se movimentar");
    }

    @Override
    public void reproduzir() {
        System.out.println("Planta está se reproduzindo");
    }
}
