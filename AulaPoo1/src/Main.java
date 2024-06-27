import exercicios.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("1 - Novo aluno\n2 - Ver alunos\n3 - Sair");

            int operacao = scan.nextInt();

            switch (operacao) {
                case 1:
                    alunos.add(new Aluno().cadastrar());
                    break;
                case 2:
                    System.out.println("----------- Alunos -----------");

                    for (Aluno aluno : alunos) {
                        aluno.imprimir();
                        System.out.println();
                    }
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Valor inválido");
            }
        }
    }
}
