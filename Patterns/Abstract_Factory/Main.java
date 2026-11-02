

public class Main {
    public static void main(String[] args) {
        System.out.println("Aplicacao Android:");
        new Aplicacao(new FabricaAndroid()).renderizarComponentes();

        System.out.println("Aplicacao iOS:");
        new Aplicacao(new FabricaIOS()).renderizarComponentes();
    }
}
