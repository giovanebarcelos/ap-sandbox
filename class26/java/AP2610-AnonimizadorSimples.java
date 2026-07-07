import java.util.Scanner;
public class AnonimizadorSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome completo: ");
        String nome = sc.nextLine();
        String[] partes = nome.split(" ");
        String anon = partes[0].charAt(0) + "*** " + partes[partes.length-1].charAt(0) + "***";
        System.out.println("Nome original: " + nome);
        System.out.println("Nome anonimizado: " + anon);
        System.out.println("Dados anonimizados protegem a privacidade (LGPD).");
        sc.close();
    }
}