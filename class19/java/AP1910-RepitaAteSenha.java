import java.util.Scanner;
public class RepitaAteSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senha;
        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();
            if (!senha.equals(senhaCorreta))
                System.out.println("Senha incorreta. Tente novamente.");
        } while (!senha.equals(senhaCorreta));
        System.out.println("Acesso permitido!");
        sc.close();
    }
}