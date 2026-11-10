package br.edu.fapa.ap.bicicletario;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Regras R3, R4 e R5 vistas pelo bicicletário, composição e a matriz de ocupação. */
class BicicletarioTest {

    private static final int SEGUNDA = 1;
    private static final int MANHA = 0;

    private Bicicletario bicicletario;

    @BeforeEach
    void prepararComDoisCiclistas() {
        bicicletario = new Bicicletario();
        bicicletario.cadastrarCiclista("Ana Teste", "100001");
        bicicletario.cadastrarCiclista("Bruno Exemplo", "100002");
    }

    @Test
    void composicaoCriaAsQuarentaVagasLivres() {
        assertEquals(40, bicicletario.getCapacidade());
        assertEquals(40, bicicletario.vagasLivres());
    }

    @Test
    void naoCadastraMatriculaRepetidaNemInvalida() {
        assertFalse(bicicletario.cadastrarCiclista("Outra Pessoa", "100001"));
        assertFalse(bicicletario.cadastrarCiclista("Outra Pessoa", "12345"));
        assertFalse(bicicletario.cadastrarCiclista("", "100009"));
        assertEquals(2, bicicletario.totalCiclistas());
    }

    @Test
    void entradaOcupaAPrimeiraVagaLivre() {
        // Act
        int vaga = bicicletario.registrarEntrada("100001", "B10", "azul", SEGUNDA, MANHA);
        // Assert
        assertEquals(1, vaga);
        assertEquals(39, bicicletario.vagasLivres());
    }

    @Test
    void ct19_entradaDeMatriculaNaoCadastradaERecusada() {
        int resultado = bicicletario.registrarEntrada("999999", "B10", "azul", SEGUNDA, MANHA);
        assertEquals(Bicicletario.ERRO_CICLISTA_INEXISTENTE, resultado);
    }

    @Test
    void ct20_ciclistaBloqueadoNaoEntra() {
        // Arrange: três permanências acima de 12 h
        for (int i = 0; i < Ciclista.MAX_ATRASOS; i++) {
            int vaga = bicicletario.registrarEntrada("100001", "B10", "azul", SEGUNDA, MANHA);
            bicicletario.registrarSaida(vaga, Uso.LIMITE_ATRASO_MIN + 1);
        }
        // Act
        int resultado = bicicletario.registrarEntrada("100001", "B10", "azul", SEGUNDA, MANHA);
        // Assert
        assertEquals(Bicicletario.ERRO_CICLISTA_BLOQUEADO, resultado);
    }

    @Test
    void ct21_ciclistaNaoEstacionaDuasBicicletasAoMesmoTempo() {
        bicicletario.registrarEntrada("100001", "B10", "azul", SEGUNDA, MANHA);
        int resultado = bicicletario.registrarEntrada("100001", "B11", "verde", SEGUNDA, MANHA);
        assertEquals(Bicicletario.ERRO_CICLISTA_JA_ESTACIONADO, resultado);
    }

    @Test
    void mesmaBicicletaNaoEntraDuasVezes() {
        bicicletario.registrarEntrada("100001", "B10", "azul", SEGUNDA, MANHA);
        int resultado = bicicletario.registrarEntrada("100002", "b10", "azul", SEGUNDA, MANHA);
        assertEquals(Bicicletario.ERRO_BICICLETA_JA_ESTACIONADA, resultado);
    }

    @Test
    void ct22_ultimaVagaEntraEADepoisLota() {
        // Arrange: bicicletário pequeno, com 2 vagas, para testar o limite R3
        Bicicletario pequeno = new Bicicletario(2, new Tarifa());
        pequeno.cadastrarCiclista("Ana Teste", "100001");
        pequeno.cadastrarCiclista("Bruno Exemplo", "100002");
        pequeno.cadastrarCiclista("Carla Ficticia", "100003");
        // Act
        int primeira = pequeno.registrarEntrada("100001", "B10", "azul", SEGUNDA, MANHA);
        int ultima = pequeno.registrarEntrada("100002", "B20", "preta", SEGUNDA, MANHA);
        int lotado = pequeno.registrarEntrada("100003", "B30", "verde", SEGUNDA, MANHA);
        // Assert
        assertEquals(1, primeira);
        assertEquals(2, ultima);
        assertEquals(Bicicletario.ERRO_LOTADO, lotado);
    }

    @Test
    void ct23_diaOuTurnoForaDaFaixaSaoDadosInvalidos() {
        assertEquals(Bicicletario.ERRO_DADOS_INVALIDOS,
                bicicletario.registrarEntrada("100001", "B10", "azul", 7, MANHA));
        assertEquals(Bicicletario.ERRO_DADOS_INVALIDOS,
                bicicletario.registrarEntrada("100001", "B10", "azul", SEGUNDA, 3));
        assertEquals(Bicicletario.ERRO_DADOS_INVALIDOS,
                bicicletario.registrarEntrada("100001", "B 10", "azul", SEGUNDA, MANHA));
    }

    @Test
    void saidaCobraELiberaAVaga() {
        int vaga = bicicletario.registrarEntrada("100001", "B10", "azul", SEGUNDA, MANHA);
        double valor = bicicletario.registrarSaida(vaga, 241);
        assertEquals(4.0, valor, 0.001);
        assertEquals(40, bicicletario.vagasLivres());
        assertEquals(4.0, bicicletario.totalArrecadado(), 0.001);
    }

    @Test
    void ct24_saidaDeVagaVaziaERecusada() {
        assertEquals(Tarifa.VALOR_INVALIDO, bicicletario.registrarSaida(5, 60), 0.001);
    }

    @Test
    void entradaContaNaMatrizDeOcupacao() {
        bicicletario.registrarEntrada("100001", "B10", "azul", SEGUNDA, MANHA);
        bicicletario.registrarEntrada("100002", "B20", "preta", SEGUNDA, MANHA);
        assertEquals(2, bicicletario.getOcupacao()[SEGUNDA][MANHA]);
        assertArrayEquals(new int[] {SEGUNDA, MANHA}, bicicletario.horarioMaisMovimentado());
    }

    @Test
    void getOcupacaoDevolveUmaCopia() {
        // Arrange
        int[][] copia = bicicletario.getOcupacao();
        // Act: alterar a cópia de fora da classe
        copia[SEGUNDA][MANHA] = 99;
        // Assert: a matriz interna não mudou (encapsulamento)
        assertEquals(0, bicicletario.getOcupacao()[SEGUNDA][MANHA]);
    }

    @Test
    void semEntradasNaoHaHorarioMaisMovimentado() {
        assertArrayEquals(new int[] {-1, -1}, bicicletario.horarioMaisMovimentado());
        assertTrue(bicicletario.usosAbertos().isEmpty());
    }
}
