package padroesestruturais.decorator;

public class PacoteViagem implements Pacote {

    public float preco;

    public PacoteViagem() {
    }

    public PacoteViagem(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getItens() {
        return "Passagem";
    }

}
