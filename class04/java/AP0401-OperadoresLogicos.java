import java.util.Scanner;
public class Voto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: "); int idade = sc.nextInt();
        System.out.print("Tem titulo? (s/n): "); boolean titulo = sc.next().equalsIgnoreCase("s");
        if (idade >= 16 && titulo) System.out.println("Pode votar");
        else System.out.println("Nao pode votar");
    }
}
