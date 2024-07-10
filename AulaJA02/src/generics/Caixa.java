package generics;

public class Caixa<T> {
    private T conteudo;

    public void colocar(T coisa) {
        this.conteudo = coisa;
    }

    public void tirar() {
        this.conteudo = null;
    }

    public T verConteudo() {
        return conteudo;
    }
}
