import java.util.Scanner;
public class FuncaoPotencia {
    static double potencia(double base, int exp) {
        if (exp == 0) return 1;
        double res = 1;
        for (int i = 0; i < Math.abs(exp); i++) res *= base;
        return exp < 0 ? 1/res : res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: "); double b = sc.nextDouble();
        System.out.print("Expoente: "); int e = sc.nextInt();
        System.out.printf("%.1f^%d = %.4f%n", b, e, potencia(b, e));
        sc.close();
    }
}