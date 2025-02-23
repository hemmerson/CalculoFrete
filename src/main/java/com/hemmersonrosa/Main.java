package com.hemmersonrosa;

public class Main {
    public static void main(String[] args) {
        Entrega entrega = new Entrega();
        entrega.mostraDetalhes();
        System.out.println();
        entrega.setStrategy(new EntregaExpressa());
        entrega.mostraDetalhes();
        System.out.println();
        Entrega entrega2 = new Entrega(new EntregaTransportadora());
        entrega2.mostraDetalhes();
    }
}