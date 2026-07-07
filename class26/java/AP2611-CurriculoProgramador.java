import java.util.Scanner;
public class CurriculoProgramador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MINI CURRÍCULO DE PROGRAMADOR ===");
        System.out.print("Nome: "); String nome = sc.nextLine();
        System.out.print("Principal linguagem: "); String ling = sc.nextLine();
        System.out.print("Anos de experiência: "); String anos = sc.nextLine();
        System.out.println("\n" + nome + " | " + ling + " | " + anos + " anos");
        System.out.println("Habilidades: Lógica, Algoritmos, Estruturas de Dados");
        System.out.println("\"Qualquer um pode programar. Basta começar.\"");
        sc.close();
    }
}