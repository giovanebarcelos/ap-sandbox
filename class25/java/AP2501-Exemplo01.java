import java.util.Scanner;
public class SistemaVotacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] votos = new int[4];
        System.out.println("=== VOTAÇÃO ===\n1 - Candidato A\n2 - Candidato B\n3 - Candidato C\n0 - Sair");
        while (true) {
            System.out.print("Seu voto: ");
            int voto = sc.nextInt();
            if (voto == 0) break;
            if (voto >= 1 && voto <= 3) votos[voto-1]++;
            else votos[3]++;
        }
        System.out.println("\nResultado:");
        System.out.println("  Candidato A: " + votos[0] + " votos");
        System.out.println("  Candidato B: " + votos[1] + " votos");
        System.out.println("  Candidato C: " + votos[2] + " votos");
        System.out.println("  Nulos: " + votos[3]);
        sc.close();
    }
}