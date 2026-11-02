package Factory_Method;

public abstract class FactoryNotificacoes {
    protected abstract IntNotificacoes criarNotificacao();

    public void enviarNotificacao() {
        IntNotificacoes notificacao = criarNotificacao();
        notificacao.enviar();
    }
}
