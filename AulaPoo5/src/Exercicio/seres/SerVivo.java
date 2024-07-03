package Exercicio.seres;

import Exercicio.*;

public abstract class SerVivo implements Ser {
    private String nomeCientifico;
    private Reino reino;
    private Filo filo;
    private Classe classe;
    private Ordem ordem;
    private Familia familia;
    private Genero genero;
    private Especie especie;

    public SerVivo() {}

    public SerVivo(String nomeCientifico, Reino reino, Filo filo, Classe classe, Ordem ordem, Familia familia, Genero genero, Especie especie) {
        this.nomeCientifico = nomeCientifico;
        this.reino = reino;
        this.filo = filo;
        this.classe = classe;
        this.ordem = ordem;
        this.familia = familia;
        this.genero = genero;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Ser Vivo" +
                "\nNome Científico: " + this.getNomeCientifico() +
                "\nReino: " + this.getReino().getNome() +
                "\nFilo: " + this.getFilo().getNome() +
                "\nClasse: " + this.getClasse().getNome() +
                "\nOrdem: " + this.getOrdem().getNome() +
                "\nFamília: " + this.getFamilia().getNome() +
                "\nGênero: " + this.getGenero().getNome() +
                "\nEspécie: " + this.getEspecie().getNome();
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public Reino getReino() {
        return reino;
    }

    public void setReino(Reino reino) {
        this.reino = reino;
    }

    public Filo getFilo() {
        return filo;
    }

    public void setFilo(Filo filo) {
        this.filo = filo;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Ordem getOrdem() {
        return ordem;
    }

    public void setOrdem(Ordem ordem) {
        this.ordem = ordem;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
}
