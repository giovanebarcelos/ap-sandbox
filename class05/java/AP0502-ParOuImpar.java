import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();
        System.out.println(n + (n % 2 == 0 ? " e PAR" : " e IMPAR"));
    }
}
