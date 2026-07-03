import java.util.Scanner;
public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo numero: ");
        int n2 = sc.nextInt();
        System.out.println("Soma = " + (n1 + n2));
    }
}
