public class Quadrado {
    private double lado;
    private String cor;

    public Quadrado(double lado, String cor) {
        this.lado = lado;
        this.cor = cor;
    }

    public double getArea() {
        // boa prática usar o getter, mesmo que dentro da própria classe
        return Math.pow(this.getLado(), 2);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
