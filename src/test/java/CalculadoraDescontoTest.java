import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.CalculadoraDesconto;
import org.junit.jupiter.api.Test;

public class CalculadoraDescontoTest {

    @Test
    public void testCalcularDescontoEstudante() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double desconto = calculadora.calcularDesconto(200.0, true);
        assertEquals(40.0, desconto, 0.01, "Desconto para estudante acima de 100 deve ser 20%");
    }

    @Test
    public void testCalcularDescontoRegular() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double desconto = calculadora.calcularDesconto(200.0, false);
        assertEquals(20.0, desconto, 0.01, "Desconto regular acima de 100 deve ser 10%");
    }

    @Test
    public void testSemDesconto() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double desconto = calculadora.calcularDesconto(50.0, false);
        assertEquals(0.0, desconto, 0.01, "Não deve haver desconto para valores abaixo de 100");
    }
}
