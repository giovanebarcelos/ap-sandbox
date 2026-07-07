public class BoasPraticasNomes {
    public static void main(String[] args) {
        double salarioBruto = 5000.00;
        double descontoInss = salarioBruto * 0.11;
        double descontoIr = salarioBruto * 0.075;
        double salarioLiquido = salarioBruto - descontoInss - descontoIr;
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS: R$ %.2f%n", descontoInss);
        System.out.printf("Desconto IR:   R$ %.2f%n", descontoIr);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
    }
}