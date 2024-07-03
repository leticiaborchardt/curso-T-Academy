package Exercicio.seres;

import Exercicio.*;

public interface Ser {
    Reino getReino();
    void setReino(Reino reino);

    Filo getFilo();
    void setFilo(Filo filo);

    Classe getClasse();
    void setClasse(Classe classe);

    Ordem getOrdem();
    void setOrdem(Ordem ordem);

    Familia getFamilia();
    void setFamilia(Familia familia);

    Genero getGenero();
    void setGenero(Genero genero);

    Especie getEspecie();
    void setEspecie(Especie especie);
}
