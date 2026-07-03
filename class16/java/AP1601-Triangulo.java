import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado a: ");
        double a = sc.nextDouble();
        System.out.print("Lado b: ");
        double b = sc.nextDouble();
        System.out.print("Lado c: ");
        double c = sc.nextDouble();
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) System.out.println("Triangulo EQUILATERO");
            else if (a == b || b == c || a == c) System.out.println("Triangulo ISOSCELES");
            else System.out.println("Triangulo ESCALENO");
        } else {
            System.out.println("Nao formam um triangulo");
        }
    }
}
