package org.example.cobertura;

public class AvaliacaoRamificacao {
    public String verificaNotaPresenca(int nota, boolean temPresencaMinima) {
        if (nota >= 70 && temPresencaMinima) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}

