package Exercicio2;

public class Livro extends Produto {
    private String titulo;
    private String autor;
    private String editora;

    public Livro(String nome, double preco, String titulo, String autor, String editora) {
        super(nome, preco);
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Características do Produto: \n- Nome: " + this.getNome() + "\n- Preço: R$" + this.getPreco() +
                "\nCaracterísticas do Livro: \n- Título: " + this.getTitulo() + "\n- Autor: " + this.getAutor() + "\n- Editora: " + this.getEditora();
    }
}
