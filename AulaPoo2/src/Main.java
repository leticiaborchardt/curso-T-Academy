import Exercicio11.Aluno;
import Exercicio9.Ingresso;
import Exercicio9.IngressoVIP;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50.00);
        IngressoVIP ingressoVIP = new IngressoVIP(50.00, 20.00);

        System.out.println("Informações do Ingresso:");
        ingresso.imprimirValor();

        System.out.println("\nInformações do Ingresso VIP:");
        ingressoVIP.imprimirValor();

        double diferenca = ingressoVIP.calcularValorVIP() - ingresso.getValor();
        System.out.printf("%nDiferença de preço entre Ingresso e Ingresso VIP: R$ %.2f%n", diferenca);
    }
}


