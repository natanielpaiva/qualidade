package integracao;


import org.example.integracao.CalculadoraController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraIntegracaoTest {
    @Test
    public void testaSoma() {
        CalculadoraController controller = new CalculadoraController();
        int resultado = controller.executaSoma(5, 3);
        Assertions.assertEquals(8, resultado);
    }
}

