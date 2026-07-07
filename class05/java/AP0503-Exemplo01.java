import java.util.Scanner;
public class ConversorMetros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor em metros: ");
        double m = sc.nextDouble();
        System.out.printf("%.1f m = %.1f cm = %.1f mm%n", m, m*100, m*1000);
        sc.close();
    }
}