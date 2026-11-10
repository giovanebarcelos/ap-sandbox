package br.edu.fapa.ap.bicicletario;

/**
 * Um uso do bicicletário: da entrada à saída de uma bicicleta.
 *
 * Associação com Ciclista, Bicicleta e Vaga: o uso liga os três, mas nenhum
 * deles depende do uso para existir.
 */
public class Uso {

    /** R4: acima de 12 h estacionado conta um atraso para o ciclista. */
    public static final int LIMITE_ATRASO_MIN = 12 * 60;

    private final Ciclista ciclista;
    private final Bicicleta bicicleta;
    private final Vaga vaga;
    private final int diaSemana;
    private final int turno;
    private boolean aberto;
    private int minutos;
    private double valor;

    public Uso(Ciclista ciclista, Bicicleta bicicleta, Vaga vaga, int diaSemana, int turno) {
        this.ciclista = ciclista;
        this.bicicleta = bicicleta;
        this.vaga = vaga;
        this.diaSemana = diaSemana;
        this.turno = turno;
        this.aberto = true;
        this.minutos = 0;
        this.valor = 0.0;
    }

    /**
     * Encerra o uso: calcula o valor (R1, R2), libera a vaga e, se passou de
     * 12 h, registra um atraso para o ciclista (R4).
     *
     * @return o valor a pagar, ou Tarifa.VALOR_INVALIDO se o uso já estava
     *         encerrado ou os minutos são inválidos (nesse caso nada muda)
     */
    public double encerrar(int minutosEstacionado, Tarifa tarifa) {
        if (!aberto) {
            return Tarifa.VALOR_INVALIDO;
        }
        double valorCalculado = tarifa.calcular(minutosEstacionado);
        if (valorCalculado == Tarifa.VALOR_INVALIDO) {
            return Tarifa.VALOR_INVALIDO;
        }
        this.minutos = minutosEstacionado;
        this.valor = valorCalculado;
        this.aberto = false;
        vaga.liberar();
        if (minutosEstacionado > LIMITE_ATRASO_MIN) {
            ciclista.registrarAtraso();
        }
        return valorCalculado;
    }

    public boolean isAberto() {
        return aberto;
    }

    public Ciclista getCiclista() {
        return ciclista;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public int getTurno() {
        return turno;
    }

    public int getMinutos() {
        return minutos;
    }

    public double getValor() {
        return valor;
    }
}
