# Padrão Strategy - Sistema de Entrega

Este é um projeto em Java que implementa o padrão de projeto Strategy para diferentes tipos de entrega.

## Sobre o Projeto
O projeto define uma interface `EntregaStrategy` que representa diferentes formas de entrega, permitindo a alteração dinâmica da estratégia utilizada sem modificar o código da classe `Entrega`.

## Tecnologias Utilizadas
- Java 8+
- Padrão de projeto Strategy

## Estrutura do Projeto
```
com.hemmersonrosa
│── EntregaStrategy.java  # Interface para definir a estratégia de entrega
│── EntregaTransportadora.java  # Implementação para entrega via transportadora
│── EntregaExpressa.java  # Implementação para entrega expressa
│── EntregaNormal.java  # Implementação para entrega normal
│── Entrega.java  # Classe principal que utiliza a estratégia de entrega
│── Main.java  # Classe principal que executa o sistema
```

## Exemplo de Saída
```
Tipo de entrega: Entrega Normal
Tempo de entrega: Entre 5 e 10 dias
Custo de entrega: Custo reduzido

Tipo de entrega: Entrega Expressa
Tempo de entrega: Entre 1 e 3 dias
Custo de entrega: Custo maior

Tipo de entrega: Entrega Transportadora
Tempo de entrega: Depende da empresa
Custo de entrega: Regras específicas
```

## Autor
[Hemmerson Luis Barros da Rosa](https://github.com/hemmerson)

