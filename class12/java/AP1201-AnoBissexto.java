import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        System.out.println(ano + (bissexto ? " E bissexto" : " NAO e bissexto"));
    }
}
