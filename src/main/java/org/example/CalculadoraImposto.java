package org.example;

//me siga @natanieltech
public class CalculadoraImposto {

    public double calcularImposto(double renda) {
        if (renda < 0) {
            throw new IllegalArgumentException("A renda não pode ser negativa.");
        }

        if (renda <= 20000) {
            return 0;
        } else if (renda <= 40000) {
            return (renda - 20000) * 0.10;
        } else {
            return (renda - 40000) * 0.20 + 2000; // 2000 é o imposto do segundo intervalo (20.001 até 40.000)
        }
    }
}

