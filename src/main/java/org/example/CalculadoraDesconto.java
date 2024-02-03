package org.example;

//me siga @natanieltech
public class CalculadoraDesconto {
    public double calcularDesconto(double valorTotal, boolean éEstudante) {
        if (valorTotal > 100.0) {
            return éEstudante ? valorTotal * 0.20 : valorTotal * 0.10;
        }
        return 0.0;
    }
}

