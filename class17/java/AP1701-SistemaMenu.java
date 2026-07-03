import java.util.Scanner;

public class SistemaMenu {
    static void menu() {
        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("1 - Conversor Celsius -> Fahrenheit");
        System.out.println("2 - Calculadora de IMC");
        System.out.println("3 - Par ou Impar");
        System.out.println("4 - Maior de 3 numeros");
        System.out.println("5 - Sair");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 5) {
            menu();
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Temperatura em Celsius: ");
                    double c = sc.nextDouble();
                    System.out.println(c + "C = " + (c * 9 / 5 + 32) + "F");
                    break;
                case 2:
                    System.out.print("Peso (kg): ");
                    double peso = sc.nextDouble();
                    System.out.print("Altura (m): ");
                    double altura = sc.nextDouble();
                    System.out.printf("IMC: %.1f%n", peso / (altura * altura));
                    break;
                case 3:
                    System.out.print("Numero: ");
                    int n = sc.nextInt();
                    System.out.println(n % 2 == 0 ? "PAR" : "IMPAR");
                    break;
                case 4:
                    System.out.print("a: "); double a = sc.nextDouble();
                    System.out.print("b: "); double b = sc.nextDouble();
                    System.out.print("c: "); double cc = sc.nextDouble();
                    System.out.println("Maior: " + Math.max(a, Math.max(b, cc)));
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        }
    }
}
