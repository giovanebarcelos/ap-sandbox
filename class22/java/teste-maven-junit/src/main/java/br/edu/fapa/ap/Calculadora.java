package br.edu.fapa.ap;

public class Calculadora {

    public static int dobro(int n) {
        return n * 2;
    }

    public static boolean ehPar(int n) {
        return n % 2 == 0;
    }

    public static long fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("fatorial não definido para negativos");
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
