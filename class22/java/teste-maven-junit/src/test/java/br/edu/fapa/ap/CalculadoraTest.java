package br.edu.fapa.ap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculadoraTest {

    @Test
    void dobroDeSeteEQuatorze() {
        assertEquals(14, Calculadora.dobro(7));
    }

    @Test
    void dobroDeZeroEZero() {
        assertEquals(0, Calculadora.dobro(0));
    }

    @Test
    void ehParReconheceNumeroPar() {
        assertTrue(Calculadora.ehPar(4));
    }

    @Test
    void ehParReconheceNumeroImpar() {
        assertFalse(Calculadora.ehPar(7));
    }

    @Test
    void fatorialDeCincoECentoEVinte() {
        assertEquals(120, Calculadora.fatorial(5));
    }

    @Test
    void fatorialDeZeroEUm() {
        assertEquals(1, Calculadora.fatorial(0));
    }

    @Test
    void fatorialDeNegativoLancaExcecao() {
        assertThrows(IllegalArgumentException.class, () -> Calculadora.fatorial(-1));
    }
}
