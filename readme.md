# Calculadora de Imposto

## Descrição

Este projeto Java implementa uma simples calculadora de imposto de renda. O cálculo do imposto é baseado na renda anual do indivíduo, aplicando diferentes taxas conforme a faixa de renda.

## Cálculo de Imposto

O imposto é calculado com base nas seguintes faixas de renda:

- **Isento de Imposto**: Para rendas até R$ 20.000.
- **Faixa de 10%**: Para rendas acima de R$ 20.000 até R$ 40.000. Nessa faixa, a taxa de 10% é aplicada sobre a renda que excede R$ 20.000.
- **Faixa de 20%**: Para rendas acima de R$ 40.000. Nessa faixa, a taxa de 20% é aplicada sobre a renda que excede R$ 40.000, além de um imposto fixo de R$ 2.000 referente à faixa anterior.

## Configuração do Projeto

### Pré-requisitos

- Java 17
- Maven

### Construindo o Projeto

Para construir o projeto, execute o seguinte comando na raiz do projeto:

```bash
mvn clean install
