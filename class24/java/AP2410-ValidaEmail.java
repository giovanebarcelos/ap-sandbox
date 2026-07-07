import java.util.Scanner;
public class ValidaEmail {
    static boolean validarEmail(String email) {
        int arroba = email.indexOf(64);
        if (arroba == -1) return false;
        String dominio = email.substring(arroba + 1);
        return dominio.contains(".");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu email: ");
        String email = sc.nextLine();
        if (validarEmail(email)) System.out.println("Email " + email + " eh VALIDO!");
        else System.out.println("Email " + email + " eh INVALIDO!");
        sc.close();
    }
}