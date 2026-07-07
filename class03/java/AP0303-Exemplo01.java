import java.util.Scanner;
public class TrocarLampada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Passo 1: Pegar uma lâmpada nova.");
        System.out.println("Passo 2: Subir na escada com cuidado.");
        System.out.print("A energia está desligada? (s/n): ");
        String resp = sc.nextLine();
        if (resp.equalsIgnoreCase("s")) {
            System.out.println("Passo 3: Retirar lâmpada queimada.");
            System.out.println("Passo 4: Rosquear lâmpada nova.");
            System.out.println("Passo 5: Ligar interruptor para testar.");
        } else System.out.println("Desligue a energia primeiro!");
        sc.close();
    }
}