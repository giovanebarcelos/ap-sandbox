package br.edu.fapa.ap.bicicletario;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/** Encapsulamento da Vaga: o estado só muda por ocupar() e liberar(). */
class VagaTest {

    @Test
    void vagaNovaEstaLivreEPodeSerOcupada() {
        // Arrange
        Vaga vaga = new Vaga(1);
        // Act
        boolean ocupou = vaga.ocupar();
        // Assert
        assertTrue(ocupou);
        assertTrue(vaga.isOcupada());
    }

    @Test
    void naoOcupaUmaVagaJaOcupada() {
        Vaga vaga = new Vaga(1);
        vaga.ocupar();
        assertFalse(vaga.ocupar());
    }

    @Test
    void naoLiberaUmaVagaLivre() {
        Vaga vaga = new Vaga(1);
        assertFalse(vaga.liberar());
        assertFalse(vaga.isOcupada());
    }
}
