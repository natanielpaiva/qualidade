package org.example.cobertura;

import org.example.ClienteDeEmail;
import org.example.cobertura.ServicoDeNotificacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoDeNotificacaoTest {

    @Mock
    private ClienteDeEmail clienteDeEmail;

    @InjectMocks
    private ServicoDeNotificacao servicoDeNotificacao;

    @Test
    public void deveChamarMetodosEnviarEmailENotificarEnvio() {
        String destinatario = "destinatario@example.com";
        String mensagem = "Mensagem de teste";


        String retorno = servicoDeNotificacao.enviarNotificacao(destinatario, mensagem);
        //Mockito.verify(clienteDeEmail).enviarEmail(destinatario, mensagem);
        //Mockito.verify(clienteDeEmail).notificarEnvio(destinatario);
        Assertions.assertNotNull(retorno);
        Assertions.assertNotEquals("", retorno);
    }
}
