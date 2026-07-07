import java.util.Scanner;
public class FuncaoPrimo {
    static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        if (ehPrimo(n)) System.out.println(n + " é PRIMO!");
        else System.out.println(n + " NÃO é primo.");
        sc.close();
    }
}