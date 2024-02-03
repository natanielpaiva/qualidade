package org.example;

//me siga @natanieltech
// Classe alvo dos testes
public class ServicoDeNotificacao {
    private ClienteDeEmail clienteDeEmail;

    public ServicoDeNotificacao(ClienteDeEmail clienteDeEmail) {
        this.clienteDeEmail = clienteDeEmail;
    }

    public void enviarNotificacao(String destinatario, String mensagem) {
        clienteDeEmail.enviarEmail(destinatario, mensagem);
    }
}
