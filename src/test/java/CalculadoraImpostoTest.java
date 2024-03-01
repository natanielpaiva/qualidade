import org.example.CalculadoraImposto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//me siga @natanieltech

class CalculadoraImpostoTest {

    private final CalculadoraImposto calculadora = new CalculadoraImposto();

    @Test
    void testarIsento() {
        assertEquals(0, calculadora.calcularImposto(15000));
    }

    @Test
    void testarPrimeiraFaixa() {
        assertEquals(1000, calculadora.calcularImposto(30000));
    }

    @Test
    void testarLimitePrimeiraFaixa() {
        assertEquals(2001, calculadora.calcularImposto(40000));
    }

    @Test
    void testarSegundaFaixa() {
        assertEquals(4000, calculadora.calcularImposto(50000));
    }

    @Test
    void testarRendaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.calcularImposto(-1000));
    }
}

