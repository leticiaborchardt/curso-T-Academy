public class Animal {
    String nome;
    double peso;
    boolean mamifero;

    Animal() {}

    public Animal(String nome, double peso, boolean mamifero) {
        this.nome = nome;
        this.peso = peso;
        this.mamifero = mamifero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMamifero() {
        return mamifero;
    }

    public void setMamifero(boolean mamifero) {
        this.mamifero = mamifero;
    }
}
