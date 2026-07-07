public class CalculaMediaPonderada {
    static double mediaPonderada(double[] notas, int[] pesos) {
        double somaN = 0; int somaP = 0;
        for (int i = 0; i < notas.length; i++) {
            somaN += notas[i] * pesos[i];
            somaP += pesos[i];
        }
        return somaP > 0 ? somaN/somaP : 0;
    }
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 9.0};
        int[] pesos = {2, 3, 5};
        System.out.print("Notas: ");
        for (double n : notas) System.out.print(n + " ");
        System.out.print("\nPesos: ");
        for (int p : pesos) System.out.print(p + " ");
        System.out.printf("\nMédia Ponderada: %.2f%n", mediaPonderada(notas, pesos));
    }
}