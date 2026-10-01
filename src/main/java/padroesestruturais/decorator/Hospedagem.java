package padroesestruturais.decorator;

public class Hospedagem extends PacoteDecorator {

    public Hospedagem(Pacote pacote) {
        super(pacote);
    }

    public float getPercentualPreco() {
        return 20.0f;
    }

    public String getNomeItem() {
        return "Hotel";
    }
}
