import java.util.Scanner;
public class AprovadoComRecuperacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota final: "); double nota = sc.nextDouble();
        System.out.print("Frequência (%): "); double freq = sc.nextDouble();
        if (nota >= 70 && freq >= 75) System.out.println("APROVADO!");
        else if (nota >= 40 && freq >= 75) System.out.println("RECUPERAÇÃO");
        else System.out.println("REPROVADO");
        System.out.println("Nota: " + nota + " | Frequência: " + freq + "%");
        sc.close();
    }
}