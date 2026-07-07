import java.util.Scanner;
public class FuncaoFatorial {
    static long fatorial(int n) {
        if (n < 0) return -1;
        long fat = 1;
        for (int i = 2; i <= n; i++) fat *= i;
        return fat;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        long fat = fatorial(n);
        if (fat == -1) System.out.println("Não existe fatorial de número negativo!");
        else System.out.println(n + "! = " + fat);
        sc.close();
    }
}