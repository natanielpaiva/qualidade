package org.example.cobertura;

public class Avaliacao {
    public String verificaNota(int nota) {
        if (nota >= 70) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
