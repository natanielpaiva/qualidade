package cobertura;

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
}

