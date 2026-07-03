import java.util.Scanner;

public class MediaDuasNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.printf("Media: %.1f%n", media);
        System.out.println(media >= 7 ? "Aprovado" : "Reprovado");
    }
}
