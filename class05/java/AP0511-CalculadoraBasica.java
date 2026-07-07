import java.util.Scanner;
public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Segundo número: ");
        double b = sc.nextDouble();
        System.out.println("Soma: " + (a+b));
        System.out.println("Subtração: " + (a-b));
        System.out.println("Multiplicação: " + (a*b));
        if (b != 0) System.out.printf("Divisão: %.2f%n", a/b);
        else System.out.println("Divisão: Não é possível dividir por zero");
        sc.close();
    }
}