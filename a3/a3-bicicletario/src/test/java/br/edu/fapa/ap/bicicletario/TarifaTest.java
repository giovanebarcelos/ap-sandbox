package br.edu.fapa.ap.bicicletario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/** Regras R1 e R2: valores-limite dos dois lados de cada limite. */
class TarifaTest {

    private final Tarifa tarifa = new Tarifa();

    @ParameterizedTest(name = "CT{0}: {1} min custa R$ {2}")
    @CsvSource({
        "01,    0,  0.0",   // R1: início da faixa grátis
        "02,  180,  0.0",   // R1: último minuto grátis (limite, inclusive)
        "03,  181,  2.0",   // R2: 1 min além do limite já é 1 hora iniciada
        "04,  240,  2.0",   // R2: fim da 1ª hora iniciada
        "05,  241,  4.0",   // R2: começo da 2ª hora iniciada
        "06,  300,  4.0",
        "07,  301,  6.0",
        "08,  420,  8.0",   // R2: 4 horas iniciadas, abaixo do teto
        "09,  421, 10.0",   // R2: 5 horas iniciadas = exatamente o teto
        "10,  481, 10.0",   // R2: 6 horas seriam R$ 12,00, mas o teto é R$ 10,00
        "11, 1440, 10.0"    // maior permanência válida
    })
    void calculaOValorConformeAsFaixas(String caso, int minutos, double esperado) {
        // Arrange: tarifa padrão criada no atributo
        // Act
        double valor = tarifa.calcular(minutos);
        // Assert
        assertEquals(esperado, valor, 0.001);
    }

    @Test
    void ct12_minutosNegativosSaoInvalidos() {
        assertEquals(Tarifa.VALOR_INVALIDO, tarifa.calcular(-1), 0.001);
    }

    @Test
    void ct13_maisDe24HorasEInvalido() {
        assertEquals(Tarifa.VALOR_INVALIDO, tarifa.calcular(1441), 0.001);
    }

    @Test
    void tarifaPersonalizadaUsaOsValoresInformados() {
        // Arrange: 60 min grátis, R$ 3,00 por hora, teto R$ 5,00
        Tarifa outra = new Tarifa(60, 3.0, 5.0);
        // Act
        double umaHoraIniciada = outra.calcular(61);
        double acimaDoTeto = outra.calcular(300);
        // Assert
        assertEquals(3.0, umaHoraIniciada, 0.001);
        assertEquals(5.0, acimaDoTeto, 0.001);
    }

    @Test
    void tarifaComValoresNegativosUsaOsPadroes() {
        Tarifa estranha = new Tarifa(-10, -2.0, -1.0);
        assertEquals(Tarifa.LIMITE_GRATIS_PADRAO_MIN, estranha.getLimiteGratisMin());
        assertEquals(Tarifa.VALOR_HORA_PADRAO, estranha.getValorPorHora(), 0.001);
        assertEquals(Tarifa.TETO_PADRAO, estranha.getTeto(), 0.001);
    }
}
