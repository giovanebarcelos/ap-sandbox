import java.util.Scanner;
public class CalculoSalarioLiquido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Horas trabalhadas: ");
        double horas = sc.nextDouble();
        System.out.print("Valor por hora: R$ ");
        double valorHora = sc.nextDouble();
        double bruto = horas * valorHora;
        double inss = bruto * 0.08;
        double liquido = bruto - inss;
        System.out.printf("Salário Bruto:   R$ %.2f%n", bruto);
        System.out.printf("Desconto INSS:   R$ %.2f%n", inss);
        System.out.printf("Salário Líquido: R$ %.2f%n", liquido);
        sc.close();
    }
}