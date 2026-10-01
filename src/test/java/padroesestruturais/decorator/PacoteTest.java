package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacoteTest {

    @Test
    void deveRetornarPrecoPacote() {
        Pacote pacote = new PacoteViagem(1000.0f);

        assertEquals(1000.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComPasseio() {
        Pacote pacote = new Passeio(new PacoteViagem(1000.0f));

        assertEquals(1100.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComHospedagem() {
        Pacote pacote = new Hospedagem(new PacoteViagem(1000.0f));

        assertEquals(1200.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComSeguro() {
        Pacote pacote = new Seguro(new PacoteViagem(1000.0f));

        assertEquals(1050.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComPasseioMaisHospedagem() {
        Pacote pacote = new Passeio(new Hospedagem(new PacoteViagem(1000.0f)));

        assertEquals(1320.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComPasseioMaisSeguro() {
        Pacote pacote = new Passeio(new Seguro(new PacoteViagem(1000.0f)));

        assertEquals(1155.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComHospedagemMaisSeguro() {
        Pacote pacote = new Hospedagem(new Seguro(new PacoteViagem(1000.0f)));

        assertEquals(1260.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteComPasseioMaisHospedagemMaisSeguro() {
        Pacote pacote = new Passeio(new Hospedagem(new Seguro(new PacoteViagem(1000.0f))));

        assertEquals(1386.0f, pacote.getPreco());
    }

    @Test
    void deveRetornarItensPacote() {
        Pacote pacote = new PacoteViagem();

        assertEquals("Passagem", pacote.getItens());
    }

    @Test
    void deveRetornarItensPacoteComPasseio() {
        Pacote pacote = new Passeio(new PacoteViagem());

        assertEquals("Passagem/Passeio", pacote.getItens());
    }

    @Test
    void deveRetornarItensPacoteComHospedagem() {
        Pacote pacote = new Hospedagem(new PacoteViagem());

        assertEquals("Passagem/Hotel", pacote.getItens());
    }

    @Test
    void deveRetornarItensPacoteComSeguro() {
        Pacote pacote = new Seguro(new PacoteViagem());

        assertEquals("Passagem/Seguro", pacote.getItens());
    }

    @Test
    void deveRetornarItensPacoteComPasseioMaisHospedagem() {
        Pacote pacote = new Passeio(new Hospedagem(new PacoteViagem()));

        assertEquals("Passagem/Hotel/Passeio", pacote.getItens());
    }

    @Test
    void deveRetornarItensPacoteComPasseioMaisSeguro() {
        Pacote pacote = new Passeio(new Seguro(new PacoteViagem()));

        assertEquals("Passagem/Seguro/Passeio", pacote.getItens());
    }

    @Test
    void deveRetornarItensPacoteComHospedagemMaisSeguro() {
        Pacote pacote = new Hospedagem(new Seguro(new PacoteViagem()));

        assertEquals("Passagem/Seguro/Hotel", pacote.getItens());
    }

    @Test
    void deveRetornarItensPacoteComPasseioMaisHospedagemMaisSeguro() {
        Pacote pacote = new Passeio(new Hospedagem(new Seguro(new PacoteViagem())));

        assertEquals("Passagem/Seguro/Hotel/Passeio", pacote.getItens());
    }

}
