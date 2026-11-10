package br.edu.fapa.ap.bicicletario;

import java.util.ArrayList;

/**
 * O bicicletário do campus: cadastro de ciclistas, vagas, usos e a
 * estatística de ocupação por dia da semana × turno.
 *
 * Relacionamentos:
 * - COMPOSIÇÃO com Vaga: as vagas são criadas aqui, no construtor, e só
 *   existem dentro do bicicletário;
 * - ASSOCIAÇÃO com Ciclista e Uso: o bicicletário guarda referências a eles.
 *
 * Operações que podem falhar devolvem um código (constantes ERRO_*) em vez de
 * lançar exceção: exceções são da Aula 33, depois do conteúdo da A3.
 */
public class Bicicletario {

    /** R3: capacidade do bicicletário do campus. */
    public static final int CAPACIDADE_PADRAO = 40;
    public static final int MAX_CICLISTAS = 100;

    public static final int DIAS_SEMANA = 7;
    public static final int TURNOS = 3;

    // Códigos de retorno de registrarEntrada() (valores > 0 são o número da vaga)
    public static final int ERRO_DADOS_INVALIDOS = -1;
    public static final int ERRO_CICLISTA_INEXISTENTE = -2;
    public static final int ERRO_CICLISTA_BLOQUEADO = -3;
    public static final int ERRO_CICLISTA_JA_ESTACIONADO = -4;
    public static final int ERRO_BICICLETA_JA_ESTACIONADA = -5;
    public static final int ERRO_LOTADO = -6;

    private final ArrayList<Vaga> vagas;
    private final ArrayList<Ciclista> ciclistas;
    private final ArrayList<Uso> usos;
    private final Tarifa tarifa;
    /** Matriz [dia da semana][turno] com o número de entradas registradas. */
    private final int[][] ocupacao;

    /** Bicicletário padrão do campus: 40 vagas e tarifa padrão. */
    public Bicicletario() {
        this(CAPACIDADE_PADRAO, new Tarifa());
    }

    /** Bicicletário com outra capacidade e outra tarifa (útil nos testes). */
    public Bicicletario(int capacidade, Tarifa tarifa) {
        if (capacidade < 1) {
            capacidade = CAPACIDADE_PADRAO;
        }
        this.tarifa = tarifa;
        this.ciclistas = new ArrayList<>();
        this.usos = new ArrayList<>();
        this.ocupacao = new int[DIAS_SEMANA][TURNOS];
        // Composição: o todo cria as partes. Esquecer este laço deixa a lista
        // vazia e todo registro de entrada responderia "lotado".
        this.vagas = new ArrayList<>();
        for (int numero = 1; numero <= capacidade; numero++) {
            vagas.add(new Vaga(numero));
        }
    }

    /**
     * Cadastra um ciclista.
     *
     * @return true se cadastrou; false se os dados são inválidos, se a
     *         matrícula já existe ou se o cadastro está cheio
     */
    public boolean cadastrarCiclista(String nome, String matricula) {
        if (!Ciclista.nomeValido(nome) || !Ciclista.matriculaValida(matricula)) {
            return false;
        }
        if (buscarCiclista(matricula) != null || ciclistas.size() >= MAX_CICLISTAS) {
            return false;
        }
        ciclistas.add(new Ciclista(nome, matricula));
        return true;
    }

    /** Busca linear pela matrícula; devolve null se não encontrar. */
    public Ciclista buscarCiclista(String matricula) {
        for (Ciclista c : ciclistas) {
            if (c.getMatricula().equals(matricula)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Registra a entrada de uma bicicleta (R3, R4, R5).
     *
     * @param diaSemana 0 (domingo) a 6 (sábado)
     * @param turno     0 (manhã), 1 (tarde) ou 2 (noite)
     * @return o número da vaga ocupada (maior que zero) ou um código ERRO_*
     */
    public int registrarEntrada(String matricula, String codigoBicicleta, String cor,
                                int diaSemana, int turno) {
        boolean diaValido = diaSemana >= 0 && diaSemana < DIAS_SEMANA;
        boolean turnoValido = turno >= 0 && turno < TURNOS;
        boolean corValida = cor != null && !cor.trim().isEmpty();
        if (!diaValido || !turnoValido || !corValida || !Bicicleta.codigoValido(codigoBicicleta)) {
            return ERRO_DADOS_INVALIDOS;
        }

        Ciclista ciclista = buscarCiclista(matricula);
        if (ciclista == null) {
            return ERRO_CICLISTA_INEXISTENTE;
        }
        if (ciclista.isBloqueado()) {
            return ERRO_CICLISTA_BLOQUEADO;
        }
        if (usoAbertoDoCiclista(ciclista) != null) {
            return ERRO_CICLISTA_JA_ESTACIONADO;
        }
        if (bicicletaEstacionada(codigoBicicleta)) {
            return ERRO_BICICLETA_JA_ESTACIONADA;
        }

        Vaga vaga = primeiraVagaLivre();
        if (vaga == null) {
            return ERRO_LOTADO;
        }
        vaga.ocupar();
        Bicicleta bicicleta = new Bicicleta(codigoBicicleta, cor, ciclista);
        usos.add(new Uso(ciclista, bicicleta, vaga, diaSemana, turno));
        ocupacao[diaSemana][turno]++;
        return vaga.getNumero();
    }

    /**
     * Registra a saída da bicicleta que está na vaga informada.
     *
     * @return o valor a pagar, ou Tarifa.VALOR_INVALIDO se a vaga não tem uso
     *         aberto ou se os minutos são inválidos
     */
    public double registrarSaida(int numeroVaga, int minutos) {
        Uso uso = usoAbertoNaVaga(numeroVaga);
        if (uso == null) {
            return Tarifa.VALOR_INVALIDO;
        }
        return uso.encerrar(minutos, tarifa);
    }

    public int vagasLivres() {
        int livres = 0;
        for (Vaga vaga : vagas) {
            if (!vaga.isOcupada()) {
                livres++;
            }
        }
        return livres;
    }

    public int getCapacidade() {
        return vagas.size();
    }

    public int totalCiclistas() {
        return ciclistas.size();
    }

    /** Soma do valor de todos os usos já encerrados. */
    public double totalArrecadado() {
        double total = 0.0;
        for (Uso uso : usos) {
            if (!uso.isAberto()) {
                total += uso.getValor();
            }
        }
        return total;
    }

    public int totalUsosEncerrados() {
        int total = 0;
        for (Uso uso : usos) {
            if (!uso.isAberto()) {
                total++;
            }
        }
        return total;
    }

    /** Usos abertos (bicicletas no bicicletário agora), em uma lista nova. */
    public ArrayList<Uso> usosAbertos() {
        ArrayList<Uso> abertos = new ArrayList<>();
        for (Uso uso : usos) {
            if (uso.isAberto()) {
                abertos.add(uso);
            }
        }
        return abertos;
    }

    /**
     * Cópia da matriz de ocupação. Devolver a própria matriz deixaria o Main
     * alterar a estatística de fora — o mesmo motivo de um atributo ser private.
     */
    public int[][] getOcupacao() {
        int[][] copia = new int[DIAS_SEMANA][TURNOS];
        for (int dia = 0; dia < DIAS_SEMANA; dia++) {
            for (int turno = 0; turno < TURNOS; turno++) {
                copia[dia][turno] = ocupacao[dia][turno];
            }
        }
        return copia;
    }

    /**
     * Posição do maior valor da matriz de ocupação, como {dia, turno}.
     * Devolve {-1, -1} se ainda não houve nenhuma entrada.
     */
    public int[] horarioMaisMovimentado() {
        int[] posicao = {-1, -1};
        int maior = 0;
        for (int dia = 0; dia < DIAS_SEMANA; dia++) {
            for (int turno = 0; turno < TURNOS; turno++) {
                if (ocupacao[dia][turno] > maior) {
                    maior = ocupacao[dia][turno];
                    posicao[0] = dia;
                    posicao[1] = turno;
                }
            }
        }
        return posicao;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    // ----- métodos auxiliares (private: detalhes internos da classe) -----

    private Vaga primeiraVagaLivre() {
        for (Vaga vaga : vagas) {
            if (!vaga.isOcupada()) {
                return vaga;
            }
        }
        return null;
    }

    private Uso usoAbertoDoCiclista(Ciclista ciclista) {
        for (Uso uso : usos) {
            if (uso.isAberto() && uso.getCiclista() == ciclista) {
                return uso;
            }
        }
        return null;
    }

    private Uso usoAbertoNaVaga(int numeroVaga) {
        for (Uso uso : usos) {
            if (uso.isAberto() && uso.getVaga().getNumero() == numeroVaga) {
                return uso;
            }
        }
        return null;
    }

    private boolean bicicletaEstacionada(String codigo) {
        String codigoNormalizado = codigo.trim().toUpperCase();
        for (Uso uso : usos) {
            if (uso.isAberto() && uso.getBicicleta().getCodigo().equals(codigoNormalizado)) {
                return true;
            }
        }
        return false;
    }
}
