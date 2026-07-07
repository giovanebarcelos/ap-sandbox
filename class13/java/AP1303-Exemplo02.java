import java.util.Scanner;
public class CalculadoraJurosSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Capital inicial: R$ "); double c = sc.nextDouble();
        System.out.print("Taxa de juros mensal (%): "); double i = sc.nextDouble();
        System.out.print("Tempo (meses): "); int t = sc.nextInt();
        double juros = c * (i/100) * t;
        System.out.printf("Juros: R$ %.2f%n", juros);
        System.out.printf("Montante final: R$ %.2f%n", c+juros);
        sc.close();
    }
}