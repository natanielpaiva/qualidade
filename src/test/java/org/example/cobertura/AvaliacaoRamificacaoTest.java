package org.example.cobertura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.cobertura.AvaliacaoRamificacao;
import org.junit.jupiter.api.Test;

public class AvaliacaoRamificacaoTest {
    @Test
    public void testVerificaNotaPresencaAprovado() {
        AvaliacaoRamificacao avaliacao = new AvaliacaoRamificacao();
        String resultado = avaliacao.verificaNotaPresenca(80, true);
        assertEquals("Aprovado", resultado);
    }

    @Test
    public void testVerificaNotaPresencaReprovadoPorNota() {
        AvaliacaoRamificacao avaliacao = new AvaliacaoRamificacao();
        String resultado = avaliacao.verificaNotaPresenca(60, true);
        assertEquals("Reprovado", resultado);
    }

    @Test
    public void testVerificaNotaPresencaReprovadoPorPresenca() {
        AvaliacaoRamificacao avaliacao = new AvaliacaoRamificacao();
        String resultado = avaliacao.verificaNotaPresenca(80, false);
        assertEquals("Reprovado", resultado);
    }

    @Test
    public void testVerificaNotaPresencaReprovadoTotalmente() {
        AvaliacaoRamificacao avaliacao = new AvaliacaoRamificacao();
        String resultado = avaliacao.verificaNotaPresenca(60, false);
        assertEquals("Reprovado", resultado);
    }
}

