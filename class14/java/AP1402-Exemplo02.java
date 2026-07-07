import java.util.Scanner;
public class PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();
        if (num > 0) System.out.println(num + " é POSITIVO");
        else if (num < 0) System.out.println(num + " é NEGATIVO");
        else System.out.println("O número é ZERO");
        sc.close();
    }
}