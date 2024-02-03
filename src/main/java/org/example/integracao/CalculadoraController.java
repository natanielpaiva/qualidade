package org.example.integracao;

public class CalculadoraController {
    private CalculadoraService calculadoraService = new CalculadoraService();

    public int executaSoma(int a, int b) {
        return calculadoraService.soma(a, b);
    }
}
