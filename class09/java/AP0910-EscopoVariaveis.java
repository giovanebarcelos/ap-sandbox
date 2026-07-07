import java.util.Scanner;
public class EscopoVariaveis {
    static final double PI = 3.14159;
    static double calcularArea(double raio) {
        double area = PI * raio * raio;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Constante PI = " + PI + " (acessível em todo o programa)");
        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();
        System.out.printf("Área do círculo: %.2f%n", calcularArea(raio));
        sc.close();
    }
}