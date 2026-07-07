import java.util.Scanner;
public class AreaRetanguloExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        double base = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.printf("A área do retângulo é %.2f%n", area);
        sc.close();
    }
}