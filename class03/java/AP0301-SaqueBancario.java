import java.util.Scanner;
public class Saque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saldo: R$ "); double saldo = sc.nextDouble();
        System.out.print("Saque: R$ "); double saque = sc.nextDouble();
        if (saque > saldo) System.out.println("Saldo insuficiente");
        else if (saque % 10 != 0) System.out.println("Use multiplos de R$10");
        else { saldo -= saque; System.out.printf("Saque liberado! Saldo: R$ %.2f%n", saldo); }
    }
}
