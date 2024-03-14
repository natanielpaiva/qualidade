package org.example.cobertura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.cobertura.Avaliacao;
import org.junit.jupiter.api.Test;

public class AvaliacaoTest {
    @Test
    public void testVerificaNotaAprovado() {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.verificaNota(75);
        assertEquals("Aprovado", resultado);
    }

    @Test
    public void testVerificaNotaReprovado() {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.verificaNota(65);
        assertEquals("Reprovado", resultado);
    }

    // Novo teste para nota no limite de aprovação
    @Test
    public void testVerificaNotaNoLimiteAprovacao() {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.verificaNota(70);
        assertEquals("Aprovado", resultado);
    }

    // Novo teste para nota logo abaixo do limite de aprovação
    @Test
    public void testVerificaNotaAbaixoLimiteAprovacao() {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.verificaNota(69);
        assertEquals("Reprovado", resultado);
    }
}

