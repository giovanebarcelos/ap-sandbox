import java.util.Scanner;
import java.util.Random;
public class JogoParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("=== PAR OU ÍMPAR ===");
        System.out.print("Escolha um número (0-10): ");
        int jogador = sc.nextInt();
        int computador = rand.nextInt(11);
        int soma = jogador + computador;
        System.out.println("Você: " + jogador + " | Computador: " + computador + " | Soma: " + soma);
        if (soma % 2 == 0) System.out.println("Soma PAR — Venceu quem escolheu PAR!");
        else System.out.println("Soma ÍMPAR — Venceu quem escolheu ÍMPAR!");
        sc.close();
    }
}