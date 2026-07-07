import java.util.Scanner;
public class Saudacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: "); String nome = sc.nextLine();
        System.out.print("Idade: "); int idade = sc.nextInt();
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
    }
}
