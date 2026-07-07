import java.util.Scanner;
public class CalcularTroco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor da compra: R$ ");
        double valor = sc.nextDouble();
        System.out.print("Valor pago: R$ ");
        double pago = sc.nextDouble();
        double troco = pago - valor;
        if (troco < 0) System.out.println("Dinheiro insuficiente!");
        else System.out.printf("Troco: R$ %.2f%n", troco);
        sc.close();
    }
}