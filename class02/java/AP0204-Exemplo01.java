import java.util.Scanner;
public class ParOuImparFluxograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        if (num % 2 == 0) System.out.println(num + " é PAR");
        else System.out.println(num + " é ÍMPAR");
        sc.close();
    }
}