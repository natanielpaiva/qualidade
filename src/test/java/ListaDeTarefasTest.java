import static org.junit.jupiter.api.Assertions.*;

import org.example.ListaDeTarefas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListaDeTarefasTest {
    private ListaDeTarefas lista;

    @BeforeEach
    public void setUp() {
        lista = new ListaDeTarefas();
    }

    @Test
    public void testAdicionarTarefa() {
        lista.adicionarTarefa("Estudar Java");
        assertTrue(lista.buscarTarefa("Estudar Java").isPresent(), "A tarefa deveria estar na lista");
    }

    @Test
    public void testRemoverTarefa() {
        lista.adicionarTarefa("Fazer exercícios");
        lista.removerTarefa("Fazer exercícios");
        assertFalse(lista.buscarTarefa("Fazer exercícios").isPresent(), "A tarefa não deveria estar na lista");
    }

    @Test
    public void testBuscarTarefa() {
        lista.adicionarTarefa("Comprar leite");
        assertTrue(lista.buscarTarefa("Comprar leite").isPresent(), "Deveria encontrar a tarefa adicionada");
    }
}

