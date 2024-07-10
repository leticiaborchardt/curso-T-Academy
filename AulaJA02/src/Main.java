import CorrecaoExAluno.Aluno;
import CorrecaoExAluno.GerenciadorAlunos;
import generics.Caixa;
import generics.Carro;
import generics.Livro;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
//
//        System.out.println("Alunos cadastrados");
//        for (Map.Entry<String, Aluno> aluno : gerenciadorAlunos.getAlunos().entrySet()) {
//            System.out.println(aluno.getValue().toString());
//        }
//
//        System.out.println(gerenciadorAlunos.getNotaAluno("Alastor"));


        Livro livro = new Livro("Livrinho", "Autorzinho", 2000);
        Carro carro = new Carro("Volkswagen", "Kombi", "Vermelha");

        Caixa<String> caixa = new Caixa<String>();
        Caixa<Livro> caixa2 = new Caixa<Livro>();
        Caixa<Carro> caixa3 = new Caixa<Carro>();

        caixa.colocar("Tomate");

        System.out.println(caixa.verConteudo());
    }
}