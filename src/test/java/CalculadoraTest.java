import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Calculadora;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.somar(2, 3), "A soma deve ser 5");
    }

    @Test
    public void testSubtrair() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.subtrair(4, 3), "A subtração deve resultar em 1");
    }
}

