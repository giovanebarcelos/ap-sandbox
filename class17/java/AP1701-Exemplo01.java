import java.util.Scanner;
public class MenuCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CALCULADORA ===");
        System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
        System.out.print("Escolha: "); int op = sc.nextInt();
        System.out.print("Número 1: "); double a = sc.nextDouble();
        System.out.print("Número 2: "); double b = sc.nextDouble();
        switch (op) {
            case 1: System.out.println(a+" + "+b+" = "+(a+b)); break;
            case 2: System.out.println(a+" - "+b+" = "+(a-b)); break;
            case 3: System.out.println(a+" × "+b+" = "+(a*b)); break;
            case 4:
                if (b!=0) System.out.printf("%.1f ÷ %.1f = %.2f%n",a,b,a/b);
                else System.out.println("Erro: divisão por zero!");
                break;
            default: System.out.println("Opção inválida!");
        }
        sc.close();
    }
}