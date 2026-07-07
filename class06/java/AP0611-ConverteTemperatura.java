import java.util.Scanner;
public class ConverteTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura em °C: ");
        double c = sc.nextDouble();
        System.out.printf("%.1f°C = %.1f°F%n", c, c*9/5+32);
        sc.close();
    }
}