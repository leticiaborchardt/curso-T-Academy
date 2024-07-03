package Exemplo01;

public abstract class Veiculo {
    public boolean isLigado;

    abstract void mover();

    void ligar() {
        this.isLigado = true;
        System.out.println("Veículo ligado");
    }
}
