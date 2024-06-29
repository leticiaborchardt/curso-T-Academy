package Exemplo1;

public class Cachorro extends Animal {
    private int volumeLatido;

    public Cachorro(int id, String nome, String raca, int volumeLatido) {
        super(id, nome, raca);
        this.volumeLatido = volumeLatido;
    }

    public int getVolumeLatido() {
        return volumeLatido;
    }

    public void setVolumeLatido(int volumeLatido) {
        this.volumeLatido = volumeLatido;
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("*Au Au Au*");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", volumeLatido=" + volumeLatido +
                '}';
    }
}
