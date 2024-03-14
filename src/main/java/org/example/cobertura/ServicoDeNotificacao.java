package org.example.cobertura;

import org.example.ClienteDeEmail;

//me siga @natanieltech
public class ServicoDeNotificacao {
    private ClienteDeEmail clienteDeEmail;

    public ServicoDeNotificacao(ClienteDeEmail clienteDeEmail) {
        this.clienteDeEmail = clienteDeEmail;
    }

    public String enviarNotificacao(String destinatario, String mensagem) {
         clienteDeEmail.enviarEmail(destinatario, mensagem);
         clienteDeEmail.notificarEnvio(destinatario);
         return "Email enviado";
    }
}
