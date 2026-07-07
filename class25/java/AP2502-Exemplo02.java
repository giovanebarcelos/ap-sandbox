import java.util.Scanner;
public class SimuladorEmprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor do empréstimo: R$ ");
        double valor = sc.nextDouble();
        System.out.print("Taxa mensal (%): ");
        double taxa = sc.nextDouble()/100;
        System.out.print("Número de parcelas: ");
        int meses = sc.nextInt();
        double parcela = valor * taxa * Math.pow(1+taxa, meses) / (Math.pow(1+taxa, meses)-1);
        double total = parcela * meses;
        System.out.printf("\nParcela mensal: R$ %.2f%n", parcela);
        System.out.printf("Total a pagar: R$ %.2f%n", total);
        System.out.printf("Juros totais:  R$ %.2f%n", total-valor);
        sc.close();
    }
}