import java.util.Scanner;
import java.util.Random;
public class DadosViciados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Quantos lançamentos? ");
        int n = sc.nextInt();
        int[] freq = new int[7];
        for (int i = 0; i < n; i++)
            freq[rand.nextInt(6)+1]++;
        System.out.println("\nResultados:");
        for (int face = 1; face <= 6; face++)
            System.out.printf("Face %d: %d vezes (%.1f%%)%n", face, freq[face], freq[face]*100.0/n);
        sc.close();
    }
}