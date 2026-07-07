import java.util.Scanner;
public class SomaAteZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            double n = sc.nextDouble();
            if (n == 0) break;
            soma += n;
        }
        System.out.printf("Soma total: %.2f%n", soma);
        sc.close();
    }
}