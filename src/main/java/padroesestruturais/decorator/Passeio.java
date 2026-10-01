package padroesestruturais.decorator;

public class Passeio extends PacoteDecorator {

    public Passeio(Pacote pacote) {
        super(pacote);
    }

    public float getPercentualPreco() {
        return 10.0f;
    }

    public String getNomeItem() {
        return "Passeio";
    }
}
