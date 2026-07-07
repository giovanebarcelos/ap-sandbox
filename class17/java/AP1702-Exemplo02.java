import java.util.Scanner;
public class MenuConversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CONVERSOR ===\n1 - °C → °F\n2 - km → milhas\n3 - kg → libras");
        System.out.print("Escolha: "); int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.print("°C: "); double c = sc.nextDouble();
                System.out.printf("%.1f°C = %.1f°F%n", c, c*9/5+32); break;
            case 2:
                System.out.print("km: "); double km = sc.nextDouble();
                System.out.printf("%.2f km = %.2f milhas%n", km, km*0.6214); break;
            case 3:
                System.out.print("kg: "); double kg = sc.nextDouble();
                System.out.printf("%.2f kg = %.2f libras%n", kg, kg*2.2046); break;
            default: System.out.println("Opção inválida!");
        }
        sc.close();
    }
}