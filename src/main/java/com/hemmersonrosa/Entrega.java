package com.hemmersonrosa;

public class Entrega {
    private EntregaStrategy strategy;

    public Entrega() {
        this.strategy = new EntregaNormal();
    }

    public Entrega(EntregaStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(EntregaStrategy strategy) {
        this.strategy = strategy;
    }

    public void mostraDetalhes() {
        String nomeClasse = strategy.getClass().getSimpleName();
        String tipo = nomeClasse.substring(0, 7) + " " + nomeClasse.substring(7);
        System.out.println("Tipo de entrega: " + tipo);
        System.out.println("Tempo de entrega: " + strategy.tempoEntrega());
        System.out.println("Custo de entrega: " + strategy.custoEntrega());
    }
}
