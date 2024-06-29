import Exercicio2.Livro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Livro", 54.99, "Harry Potter", "J.K. Rowling", "Rocco"));
        livros.add(new Livro("Livro", 68.90, "O Instituto", "Stephen King", "Suma"));
        livros.add(new Livro("Livro", 78.90, "Código Limpo", "Robert C. Martin", "Alta Books"));
        livros.add(new Livro("Livro", 64.79, "Arquitetura Limpa", "Robert C. Martin", "Alta Books"));

        for (Livro livro : livros) {
            System.out.println(livro);
            System.out.println("\n-----------------------------------\n");
        }
    }
}


