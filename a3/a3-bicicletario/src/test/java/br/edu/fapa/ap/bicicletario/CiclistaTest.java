package br.edu.fapa.ap.bicicletario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/** Regras R4 (bloqueio) e R6 (matrícula) e o encapsulamento do Ciclista. */
class CiclistaTest {

    @Test
    void ct14_comDoisAtrasosAindaNaoEstaBloqueado() {
        // Arrange
        Ciclista ciclista = new Ciclista("Ana Teste", "100001", 2);
        // Act
        boolean bloqueado = ciclista.isBloqueado();
        // Assert
        assertFalse(bloqueado);
    }

    @Test
    void ct15_comTresAtrasosFicaBloqueado() {
        Ciclista ciclista = new Ciclista("Ana Teste", "100001", 2);
        ciclista.registrarAtraso();
        assertTrue(ciclista.isBloqueado());
        assertEquals(3, ciclista.getAtrasos());
    }

    @Test
    void construtorSemAtrasosComecaEmZero() {
        Ciclista ciclista = new Ciclista("Ana Teste", "100001");
        assertEquals(0, ciclista.getAtrasos());
        assertFalse(ciclista.isBloqueado());
    }

    @Test
    void construtorTrocaAtrasoNegativoPorZero() {
        Ciclista ciclista = new Ciclista("Ana Teste", "100001", -5);
        assertEquals(0, ciclista.getAtrasos());
    }

    @Test
    void setNomeRecusaNomeCurtoEMantemOAnterior() {
        // Arrange
        Ciclista ciclista = new Ciclista("Ana Teste", "100001");
        // Act
        boolean aceitou = ciclista.setNome(" A ");
        // Assert
        assertFalse(aceitou);
        assertEquals("Ana Teste", ciclista.getNome());
    }

    @Test
    void setNomeAceitaNomeValido() {
        Ciclista ciclista = new Ciclista("Ana Teste", "100001");
        assertTrue(ciclista.setNome("  Ana Souza Teste  "));
        assertEquals("Ana Souza Teste", ciclista.getNome());
    }

    @Test
    void ct16_matriculaPrecisaTerExatamenteSeisDigitos() {
        assertTrue(Ciclista.matriculaValida("123456"));
        assertFalse(Ciclista.matriculaValida("12345"));    // 5 dígitos
        assertFalse(Ciclista.matriculaValida("1234567"));  // 7 dígitos
        assertFalse(Ciclista.matriculaValida("12a456"));   // letra
        assertFalse(Ciclista.matriculaValida(null));
    }
}
