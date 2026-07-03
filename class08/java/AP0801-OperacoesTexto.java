import java.util.Scanner;

public class OperacoesTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Ola, " + nome + "!");
        System.out.println("Seu nome tem " + nome.length() + " caracteres");
        System.out.println("Em maiusculas: " + nome.toUpperCase());
        System.out.println("Em minusculas: " + nome.toLowerCase());
        System.out.println("Primeira letra: " + nome.charAt(0));
    }
}
