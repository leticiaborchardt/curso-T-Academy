import Exemplo01.ExemploLambda;
import ExercicioLambda.Pessoa;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("peixes", "porta", "texto");

        Collections.sort(palavras, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.forEach(System.out::println);


        // exemplo lambda
        ExemploLambda adicionador = (numero) -> numero + 90;
        System.out.println(adicionador.adicionar(20));


        exercicioLambdas();
    }

    public static void exercicioLambdas() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Exercício 1
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(numerosPares);


        // Exercício 2
        List<Integer> numerosDobrados = numeros.stream()
                .map(numero -> numero * 2)
                .collect(Collectors.toList());

        System.out.println(numerosDobrados);


        // Exercício 3
        boolean todosMaiorQue10 = numeros.stream()
                .allMatch(numero -> numero > 10);

        boolean todosMenorOuIgualA10 = numeros.stream()
                .allMatch(numero -> numero <= 10);

        System.out.println(todosMaiorQue10);
        System.out.println(todosMenorOuIgualA10);


        // Exercício 4
        Integer maiorNumeroDaLista = numeros.stream()
                .max(Integer::compareTo)
                .orElseThrow();

        System.out.println(maiorNumeroDaLista);


        // Exercicio 5
        List<String> cores = Arrays.asList("azul", "cor-de-rosa", "vermelho", "roxo", "preto", "amarelo");

        List<String> coresEmMaiusculo = cores.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(coresEmMaiusculo);

        // Exercício 6
        List<String> coresPorTamanho = cores.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .toList();

        System.out.println(coresPorTamanho);

        // Exercicio 7
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Maria", 32));
        pessoas.add(new Pessoa("João", 25));
        pessoas.add(new Pessoa("Júlia", 25));
        pessoas.add(new Pessoa("Fernando", 30));
        pessoas.add(new Pessoa("Claudio", 20));
        pessoas.add(new Pessoa("Lucas", 20));

        Map<Integer, List<Pessoa>> pessoasPorIdade = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getIdade));

        pessoasPorIdade.forEach((idade, grupoPessoas) -> {
            System.out.println("\nIdade: " + idade);
            grupoPessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));
        });

        // Exercício 8
        List<Integer> valores = Arrays.asList(6, 10, 8);

        double media = valores.stream()
                .collect(Collectors.averagingDouble(numero -> numero));

        System.out.println(media);

        // Exercício 9
        List<Integer> elementos = Arrays.asList(10, 11, 11, 20, 20, 20, 25, 26, 27, 27, 30);
        List<Integer> elementosUnicos = elementos.stream().distinct().toList();
        System.out.println(elementosUnicos);

        // Exercício 10
        List<Integer> lista1 = Arrays.asList(1, 2, 3);
        List<Integer> lista2 = Arrays.asList(4, 5, 6);

        List<Integer> listaCombinada = lista1.stream()
                .flatMap(i -> {
                    int elementoListaAtual = i;
                    int indexAtual = lista1.indexOf(i);

                    return Stream.of(elementoListaAtual,
                            lista2.stream().skip(indexAtual).findFirst().orElse(0));
                })
                .toList();

        System.out.println(listaCombinada);

        // outra forma de fazer
        List<Integer> listaCombinada2 = IntStream.range(0, lista1.size())
                .boxed()
                .flatMap(i -> Arrays.asList(lista1.get(i), lista2.get(i)).stream())
                .collect(Collectors.toList());

        // outra forma de fazer com listas de tamanhos diferentes
        List<Integer> lista3 = Arrays.asList(1, 2, 3);
        List<Integer> lista4 = Arrays.asList(4, 5, 6, 7, 8);

        int maxSize = Math.max(lista3.size(), lista4.size());

        List<Integer> listaCombinada3 = IntStream.range(0, maxSize)
                .boxed()
                .flatMap(i -> Arrays.asList(
                        i < lista3.size() ? lista3.get(i) : null,
                        i < lista4.size() ? lista4.get(i) : null
                        ).stream()
                )
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        System.out.println(listaCombinada3);
    }
}