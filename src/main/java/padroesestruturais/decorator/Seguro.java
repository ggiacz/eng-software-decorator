package padroesestruturais.decorator;

public class Seguro extends PacoteDecorator {

    public Seguro(Pacote pacote) {
        super(pacote);
    }

    public float getPercentualPreco() {
        return 5.0f;
    }

    public String getNomeItem() {
        return "Seguro";
    }
}
