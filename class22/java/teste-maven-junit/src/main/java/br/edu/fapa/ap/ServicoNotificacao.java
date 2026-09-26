package br.edu.fapa.ap;

/**
 * Dependência externa (ex.: envio de e-mail/SMS). Em produção fala com um
 * serviço de verdade; em teste, é substituída por um dublê (mock).
 */
public interface ServicoNotificacao {
    void enviar(String destinatario, String mensagem);
}
