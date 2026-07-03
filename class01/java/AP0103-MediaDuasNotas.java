import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.printf("Media: %.1f%n", media);
        if (media >= 7) System.out.println("Aprovado");
        else System.out.println("Reprovado");
    }
}
