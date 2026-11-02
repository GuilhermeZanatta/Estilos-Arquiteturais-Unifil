package Factory_Method;

public class Main {
    public static void main(String[] args) {
        FactoryNotificacoes factoryEmail = new FactoryEmail();
        factoryEmail.enviarNotificacao();

        FactoryNotificacoes factorySMS = new FactorySMS();
        factorySMS.enviarNotificacao();
    }
}
