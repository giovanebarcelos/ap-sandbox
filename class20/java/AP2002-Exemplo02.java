import java.util.Scanner;
public class TrianguloFloyd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de linhas: ");
        int n = sc.nextInt(), num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++)
                System.out.printf("%3d", num++);
            System.out.println();
        }
        sc.close();
    }
}