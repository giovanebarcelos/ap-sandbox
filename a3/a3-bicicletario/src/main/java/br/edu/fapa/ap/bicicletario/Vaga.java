package br.edu.fapa.ap.bicicletario;

/**
 * Uma vaga física do bicicletário.
 *
 * Parte de uma COMPOSIÇÃO: as vagas são criadas pelo construtor do
 * Bicicletario e não existem fora dele.
 *
 * Encapsulamento: "ocupada" não tem setter público. A vaga só muda de estado
 * por ocupar() e liberar(), que recusam a operação impossível (ocupar uma vaga
 * já ocupada; liberar uma vaga livre). Um setOcupada(boolean) permitiria
 * pôr duas bicicletas na mesma vaga.
 */
public class Vaga {

    private final int numero;
    private boolean ocupada;

    public Vaga(int numero) {
        this.numero = numero;
        this.ocupada = false;
    }

    /** Ocupa a vaga. Devolve false se ela já estava ocupada. */
    public boolean ocupar() {
        if (ocupada) {
            return false;
        }
        ocupada = true;
        return true;
    }

    /** Libera a vaga. Devolve false se ela já estava livre. */
    public boolean liberar() {
        if (!ocupada) {
            return false;
        }
        ocupada = false;
        return true;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }
}
