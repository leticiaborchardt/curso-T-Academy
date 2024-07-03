import Exercicio.*;
import Exercicio.seres.Animal;
import Exercicio.seres.Fungo;
import Exercicio.seres.Planta;
import Exercicio.seres.SerVivo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<SerVivo> seresVivos = new ArrayList<>();

    public static void main(String[] args) {
        //Analise o conceito de ReFiCOFaGE
        //Utilizando seus conhecimentos de POO
        //Crie um sistema que permita cadastrar seres vivos em uma lista
        //Para teste, cadastre: uma planta, uma fungo e um animal.

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção para cadastrar:");
            System.out.println("[1] - Animal");
            System.out.println("[2] - Planta");
            System.out.println("[3] - Fungo");
            System.out.println("[4] - Listar todos");
            System.out.println("[0] - Sair");

            int escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    cadastrar(new Animal());
                    break;
                case 2:
                    cadastrar(new Planta());
                    break;
                case 3:
                    cadastrar(new Fungo());
                    break;
                case 4:
                    if (seresVivos.isEmpty()) {
                        System.out.println("Nenhum ser foi cadastrado.");
                    } else {
                        System.out.println("Seres cadastrados: ");
                        for (SerVivo serVivo : seresVivos) {
                            System.out.println("\n");
                            System.out.println(serVivo);
                        }
                    }
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }

    public static void cadastrar(SerVivo serVivo) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        System.out.println("Digite o reino:");
        Reino reino = new Reino(scan.next());

        System.out.println("Digite o filo:");
        Filo filo = new Filo(scan.next(), reino);

        System.out.println("Digite a classe:");
        Classe classe = new Classe(scan.next(), filo);

        System.out.println("Digite a ordem:");
        Ordem ordem = new Ordem(scan.next(), classe);

        System.out.println("Digite a família:");
        Familia familia = new Familia(scan.next(), ordem);

        System.out.println("Digite o gênero:");
        Genero genero = new Genero(scan.next(), familia);

        System.out.println("Digite a espécie:");
        Especie especie = new Especie(scan.next(), genero);

        System.out.println("Digite o nome científico:");
        String nomeCientifico = scan.next();

        serVivo.setNomeCientifico(nomeCientifico);
        serVivo.setReino(reino);
        serVivo.setFilo(filo);
        serVivo.setClasse(classe);
        serVivo.setOrdem(ordem);
        serVivo.setFamilia(familia);
        serVivo.setGenero(genero);
        serVivo.setEspecie(especie);

        seresVivos.add(serVivo);
    }
}