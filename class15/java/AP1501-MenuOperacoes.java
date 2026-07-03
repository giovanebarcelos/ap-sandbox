import java.util.Scanner;

public class MenuOperacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.print("Escolha uma opcao: ");
        int opcao = sc.nextInt();
        System.out.print("Primeiro numero: ");
        double a = sc.nextDouble();
        System.out.print("Segundo numero: ");
        double b = sc.nextDouble();
        switch (opcao) {
            case 1: System.out.println("Resultado: " + (a + b)); break;
            case 2: System.out.println("Resultado: " + (a - b)); break;
            case 3: System.out.println("Resultado: " + (a * b)); break;
            default: System.out.println("Opcao invalida");
        }
    }
}
