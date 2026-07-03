import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salario bruto: ");
        double bruto = sc.nextDouble();
        double inss = bruto * 0.11;
        double ir = bruto * 0.075;
        double liquido = bruto - inss - ir;
        System.out.printf("INSS (11%%): %.2f%n", inss);
        System.out.printf("IR (7,5%%): %.2f%n", ir);
        System.out.printf("Salario liquido: %.2f%n", liquido);
    }
}
