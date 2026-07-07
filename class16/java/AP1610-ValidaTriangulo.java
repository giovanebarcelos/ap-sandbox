import java.util.Scanner;
public class ValidaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado A: "); double a = sc.nextDouble();
        System.out.print("Lado B: "); double b = sc.nextDouble();
        System.out.print("Lado C: "); double c = sc.nextDouble();
        if (a+b>c && a+c>b && b+c>a) {
            System.out.println("É um triângulo!");
            if (a==b && b==c) System.out.println("Tipo: Equilátero");
            else if (a==b || a==c || b==c) System.out.println("Tipo: Isósceles");
            else System.out.println("Tipo: Escaleno");
        } else System.out.println("Não forma um triângulo.");
        sc.close();
    }
}