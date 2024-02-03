import static org.mockito.Mockito.*;

import org.example.ClienteDeEmail;
import org.example.ServicoDeNotificacao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServicoDeNotificacaoTest {
    private ClienteDeEmail clienteDeEmailSpy;
    private ServicoDeNotificacao servicoDeNotificacao;

    @BeforeEach
    public void setUp() {
        // Cria um spy baseado na instância real de ClienteDeEmail
        clienteDeEmailSpy = spy(new ClienteDeEmail());
        // Injeta o spy no ServicoDeNotificacao
        servicoDeNotificacao = new ServicoDeNotificacao(clienteDeEmailSpy);
    }

    @Test
    public void deveChamarEnviarEmailComParametrosCorretos() {
        String destinatario = "destinatario@example.com";
        String mensagem = "Mensagem de teste";

        // Executa o método que desejamos testar
        servicoDeNotificacao.enviarNotificacao(destinatario, mensagem);

        // Verifica se enviarEmail foi chamado uma vez com os parâmetros corretos
        verify(clienteDeEmailSpy).enviarEmail(destinatario, mensagem);
    }
}

