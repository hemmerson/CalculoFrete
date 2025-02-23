package com.hemmersonrosa;

public class EntregaExpressa implements EntregaStrategy {
    @Override
    public String tempoEntrega() {
        return "Entre 1 e 3 dias";
    }

    @Override
    public String custoEntrega() {
        return "Custo maior";
    }
}
