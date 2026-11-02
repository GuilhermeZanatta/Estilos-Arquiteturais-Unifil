public class Aplicacao {
    private final Fabrica fabrica;

    public Aplicacao(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    public void renderizarComponentes() {
        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }
}
