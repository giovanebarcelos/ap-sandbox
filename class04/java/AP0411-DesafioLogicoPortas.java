import java.util.Scanner;
public class DesafioLogicoPortas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Circuito XOR usando portas básicas:");
        System.out.println("XOR = (A OR B) AND NOT (A AND B)");
        System.out.print("A (true/false): ");
        boolean a = sc.nextBoolean();
        System.out.print("B (true/false): ");
        boolean b = sc.nextBoolean();
        boolean xor = (a || b) && !(a && b);
        System.out.println("A XOR B = " + xor);
        sc.close();
    }
}