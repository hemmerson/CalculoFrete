package com.hemmersonrosa;

public class EntregaNormal implements EntregaStrategy {
    @Override
    public String tempoEntrega() {
        return "Entre 5 e 10 dias";
    }

    @Override
    public String custoEntrega() {
        return "Custo reduzido";
    }
}
