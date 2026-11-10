package br.edu.fapa.ap.bicicletario;

/**
 * Tabela de preços do bicicletário (regras R1 e R2 da análise).
 *
 * R1: até o limite gratuito (180 min, inclusive) não se paga nada.
 * R2: acima dele, cobra-se um valor por HORA INICIADA além do limite,
 *     com um teto por permanência.
 *
 * A tarifa é um objeto (e não um punhado de constantes soltas) para que
 * o bicicletário possa ser criado com outra tabela de preços nos testes
 * e numa eventual mudança de regra, sem alterar o cálculo.
 */
public class Tarifa {

    public static final int LIMITE_GRATIS_PADRAO_MIN = 180;
    public static final double VALOR_HORA_PADRAO = 2.0;
    public static final double TETO_PADRAO = 10.0;

    /** Uma permanência vai de 0 a 24 h; fora disso o dado está errado. */
    public static final int PERMANENCIA_MAXIMA_MIN = 24 * 60;
    public static final int MINUTOS_POR_HORA = 60;

    /** Valor devolvido por calcular() quando os minutos são inválidos. */
    public static final double VALOR_INVALIDO = -1.0;

    private final int limiteGratisMin;
    private final double valorPorHora;
    private final double teto;

    /** Tarifa padrão do campus: 180 min grátis, R$ 2,00/h, teto R$ 10,00. */
    public Tarifa() {
        this(LIMITE_GRATIS_PADRAO_MIN, VALOR_HORA_PADRAO, TETO_PADRAO);
    }

    /** Tarifa personalizada. Valores negativos são trocados pelos padrões. */
    public Tarifa(int limiteGratisMin, double valorPorHora, double teto) {
        this.limiteGratisMin = (limiteGratisMin >= 0) ? limiteGratisMin : LIMITE_GRATIS_PADRAO_MIN;
        this.valorPorHora = (valorPorHora >= 0) ? valorPorHora : VALOR_HORA_PADRAO;
        this.teto = (teto >= 0) ? teto : TETO_PADRAO;
    }

    /**
     * Calcula o valor de uma permanência.
     *
     * @param minutos tempo estacionado, de 0 a 1440
     * @return o valor a pagar, ou VALOR_INVALIDO se os minutos forem inválidos
     */
    public double calcular(int minutos) {
        if (minutos < 0 || minutos > PERMANENCIA_MAXIMA_MIN) {
            return VALOR_INVALIDO;
        }
        if (minutos <= limiteGratisMin) {
            return 0.0;
        }
        int excedente = minutos - limiteGratisMin;
        // "Hora iniciada" é arredondamento PARA CIMA. Com int, excedente / 60
        // arredondaria para baixo e 181 min sairia de graça.
        int horasIniciadas = (excedente + MINUTOS_POR_HORA - 1) / MINUTOS_POR_HORA;
        double valor = horasIniciadas * valorPorHora;
        if (valor > teto) {
            valor = teto;
        }
        return valor;
    }

    public int getLimiteGratisMin() {
        return limiteGratisMin;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public double getTeto() {
        return teto;
    }
}
