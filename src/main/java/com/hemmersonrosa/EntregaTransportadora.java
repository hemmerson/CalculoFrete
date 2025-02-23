package com.hemmersonrosa;

public class EntregaTransportadora implements EntregaStrategy {
    @Override
    public String tempoEntrega() {
        return "Depende da empresa";
    }

    @Override
    public String custoEntrega() {
        return "Regras específicas";
    }
}
