package br.edu.fapa.ap.bicicletario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Encerramento de um uso: valor, liberação da vaga e regra R4 (atraso). */
class UsoTest {

    private Ciclista ciclista;
    private Vaga vaga;
    private Uso uso;
    private final Tarifa tarifa = new Tarifa();

    @BeforeEach
    void prepararUsoAberto() {
        ciclista = new Ciclista("Ana Teste", "100001");
        vaga = new Vaga(7);
        vaga.ocupar();
        Bicicleta bicicleta = new Bicicleta("B10", "azul", ciclista);
        uso = new Uso(ciclista, bicicleta, vaga, 1, 0);
    }

    @Test
    void encerrarCalculaOValorELiberaAVaga() {
        // Act
        double valor = uso.encerrar(181, tarifa);
        // Assert
        assertEquals(2.0, valor, 0.001);
        assertFalse(uso.isAberto());
        assertFalse(vaga.isOcupada());
    }

    @Test
    void ct17_exatamente12HorasNaoContaAtraso() {
        uso.encerrar(Uso.LIMITE_ATRASO_MIN, tarifa);
        assertEquals(0, ciclista.getAtrasos());
    }

    @Test
    void ct18_umMinutoAlemDe12HorasContaAtraso() {
        uso.encerrar(Uso.LIMITE_ATRASO_MIN + 1, tarifa);
        assertEquals(1, ciclista.getAtrasos());
    }

    @Test
    void naoEncerraDuasVezes() {
        uso.encerrar(60, tarifa);
        assertEquals(Tarifa.VALOR_INVALIDO, uso.encerrar(60, tarifa), 0.001);
    }

    @Test
    void minutosInvalidosNaoMudamNada() {
        double valor = uso.encerrar(-1, tarifa);
        assertEquals(Tarifa.VALOR_INVALIDO, valor, 0.001);
        assertTrue(uso.isAberto());
        assertTrue(vaga.isOcupada());
    }
}
