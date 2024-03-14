package org.example.cobertura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.cobertura.AvaliacaoCondicao;
import org.junit.jupiter.api.Test;

public class AvaliacaoCondicaoTest {
    @Test
    public void testVerificaNotaPresencaExtraAprovadoPorNotaPresenca() {
        AvaliacaoCondicao avaliacao = new AvaliacaoCondicao();
        String resultado = avaliacao.verificaNotaPresencaExtra(80, true, false);
        assertEquals("Aprovado", resultado);
    }

    @Test
    public void testVerificaNotaPresencaExtraAprovadoPorTrabalhoExtra() {
        AvaliacaoCondicao avaliacao = new AvaliacaoCondicao();
        String resultado = avaliacao.verificaNotaPresencaExtra(60, false, true);
        assertEquals("Aprovado", resultado);
    }

    @Test
    public void testVerificaNotaPresencaExtraReprovado() {
        AvaliacaoCondicao avaliacao = new AvaliacaoCondicao();
        String resultado = avaliacao.verificaNotaPresencaExtra(60, false, false);
        assertEquals("Reprovado", resultado);
    }
}

