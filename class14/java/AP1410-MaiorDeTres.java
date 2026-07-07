import java.util.Scanner;
public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número 1: "); double a = sc.nextDouble();
        System.out.print("Número 2: "); double b = sc.nextDouble();
        System.out.print("Número 3: "); double c = sc.nextDouble();
        double maior;
        if (a >= b && a >= c) maior = a;
        else if (b >= c) maior = b;
        else maior = c;
        System.out.println("O maior número é " + maior);
        sc.close();
    }
}