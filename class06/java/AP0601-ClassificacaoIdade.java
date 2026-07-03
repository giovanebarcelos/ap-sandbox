import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: "); int id = sc.nextInt();
        if (id < 12) System.out.println("Crianca");
        else if (id < 18) System.out.println("Adolescente");
        else if (id < 60) System.out.println("Adulto");
        else System.out.println("Idoso");
    }
}
