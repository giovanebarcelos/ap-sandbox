import java.util.Scanner;
public class ClassificacaoIdadeDETALHADA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: "); int idade = sc.nextInt();
        if (idade < 0) System.out.println("Idade inválida!");
        else if (idade <= 12) System.out.println("Criança");
        else if (idade <= 17) System.out.println("Adolescente");
        else if (idade <= 59) System.out.println("Adulto");
        else if (idade <= 120) System.out.println("Idoso");
        else System.out.println("Idade improvável!");
        sc.close();
    }
}