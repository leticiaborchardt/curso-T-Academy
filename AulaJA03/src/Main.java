import Exemplo01.ExemploLambda;

import java.util.*;

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


    }
}