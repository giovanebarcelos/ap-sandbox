import java.util.Scanner;

public class MediaVetor {
    public static void main(String[] args) {
        final int MAX = 5;
        double[] notas = new double[MAX];
        double soma = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < MAX; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        System.out.printf("Media: %.1f%n", soma / MAX);
    }
}
