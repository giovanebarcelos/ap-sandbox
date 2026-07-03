import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N1: "); double a = sc.nextDouble();
        System.out.print("N2: "); double b = sc.nextDouble();
        System.out.printf("Soma: %.1f Sub: %.1f Mult: %.1f Div: %.2f%n", a+b, a-b, a*b, a/b);
    }
}
