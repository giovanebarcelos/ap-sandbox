import java.util.Scanner;
public class CalculoConsumoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância percorrida (km): ");
        double km = sc.nextDouble();
        System.out.print("Combustível gasto (L): ");
        double litros = sc.nextDouble();
        System.out.printf("Consumo médio: %.1f km/L%n", km/litros);
        sc.close();
    }
}