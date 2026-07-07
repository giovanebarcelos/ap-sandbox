import java.util.Scanner;
public class TabuadaEnquanto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt(), i = 1;
        while (i <= 10) {
            System.out.printf("%d × %2d = %3d%n", n, i, n*i);
            i++;
        }
        sc.close();
    }
}