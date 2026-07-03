import java.util.Scanner;
import java.util.Random;
public class Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int s = r.nextInt(100) + 1, p, t = 0;
        while (true) {
            System.out.print("Palpite: "); p = sc.nextInt(); t++;
            if (p < s) System.out.println("MAIOR");
            else if (p > s) System.out.println("MENOR");
            else { System.out.println("ACERTOU em " + t + " tentativas!"); break; }
        }
    }
}
