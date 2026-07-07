import java.util.Scanner;
public class DepuracaoDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numerador: "); double a = sc.nextDouble();
        System.out.print("Denominador: "); double b = sc.nextDouble();
        if (b == 0) System.out.println("Erro: divisão por zero!");
        else System.out.printf("Resultado: %.2f%n", a/b);
        sc.close();
    }
}