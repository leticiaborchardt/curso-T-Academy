package Exercicio9;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void imprimirValor() {
        System.out.printf("Valor do ingresso: R$ %.2f%n", valor);
    }
}