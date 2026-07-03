import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a media do aluno: ");
        double media = sc.nextDouble();
        if (media >= 7) System.out.println("APROVADO");
        else System.out.println("REPROVADO");
    }
}
