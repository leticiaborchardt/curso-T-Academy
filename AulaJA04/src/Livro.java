public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    @Deprecated
    public void mostrarLivro() {
        System.out.println("Livro: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
    }

    @Deprecated
    @SuppressWarnings("unchecked")
    public void fazerAlgoComLivro(String teste) {
        this.titulo += teste;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                '}';
    }

    @SafeVarargs
    public static <T> void teste(T... elementos) {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
