package org.example.models;

import java.math.BigDecimal;

public class Product {
    private String nome;
    private String dadosValores;
    private BigDecimal valorAVista;
    private BigDecimal valorAPrazo;
    private int parcelas;

    public Product(String nome, String dadosValores) {
        this.nome = nome;
        this.dadosValores = dadosValores;
        this.parcelas = getParcelas(dadosValores);
        this.valorAVista = getValorAVista(dadosValores);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDadosValores() {
        return dadosValores;
    }

    public void setDadosValores(String dadosValores) {
        this.dadosValores = dadosValores;
    }

    public BigDecimal getValorAVista(String dadosValores) {

            String valorString = dadosValores.substring(dadosValores.indexOf("$"), dadosValores.indexOf("\n")).replace("$", "")
                    .replaceAll("\\.", "") +
                    "."
                    + dadosValores.substring(dadosValores.indexOf('\n') + 1, dadosValores.indexOf('\n') + 3).trim();


        return new BigDecimal(valorString);
    }

    public void setValorAVista(BigDecimal valorAVista) {
        this.valorAVista = valorAVista;
    }

    public BigDecimal getValorAPrazo(String dadosValores) {
        return valorAPrazo;
    }

    public void setValorAPrazo(BigDecimal valorAPrazo) {
        this.valorAPrazo = valorAPrazo;
    }

    public int getParcelas(String dadosValores) {
        if (dadosValores.indexOf("até ") > 0) {
            return Integer.parseInt(dadosValores.substring(dadosValores.indexOf("até ") + 4, dadosValores.indexOf("x de")));
        }

        return 0;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}
