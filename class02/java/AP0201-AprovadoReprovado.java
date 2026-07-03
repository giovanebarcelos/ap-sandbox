import java.util.Scanner;
public class Aprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota: ");
        double nota = sc.nextDouble();
        if (nota >= 7) System.out.println("Aprovado");
        else System.out.println("Reprovado");
    }
}
