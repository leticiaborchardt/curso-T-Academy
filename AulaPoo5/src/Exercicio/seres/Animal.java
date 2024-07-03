package Exercicio.seres;

import Exercicio.*;

public class Animal extends SerVivo {
    public Animal() {
    }

    public Animal(String nomeCientifico, Reino reino, Filo filo, Classe classe, Ordem ordem, Familia familia, Genero genero, Especie especie) {
        super(nomeCientifico, reino, filo, classe, ordem, familia, genero, especie);
    }
}
