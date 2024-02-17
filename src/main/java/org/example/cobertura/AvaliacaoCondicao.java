package org.example.cobertura;

public class AvaliacaoCondicao {
    public String verificaNotaPresencaExtra(int nota, boolean temPresencaMinima, boolean temTrabalhoExtra) {
        if ((nota >= 70 && temPresencaMinima) || temTrabalhoExtra) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}

