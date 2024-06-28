package Exercicio9;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IngressoVIP extends Ingresso {
    private double valorAdicional;

    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public double calcularValorVIP() {
        return getValor() + valorAdicional;
    }

    @Override
    public void imprimirValor() {
        System.out.printf("Valor do ingresso VIP: R$ %.2f%n", calcularValorVIP());
    }
}
