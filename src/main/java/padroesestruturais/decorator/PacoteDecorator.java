package padroesestruturais.decorator;

public abstract class PacoteDecorator implements Pacote {

    private Pacote pacote;
    public String itens;

    public PacoteDecorator(Pacote pacote) {
        this.pacote = pacote;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public abstract float getPercentualPreco();

    public float getPreco() {
        return this.pacote.getPreco() * (1 + (this.getPercentualPreco() / 100));
    }

    public abstract String getNomeItem();

    public String getItens() {
        return this.pacote.getItens() + "/" + this.getNomeItem();
    }

    public void setItens(String itens) {
        this.itens = itens;
    }
}
