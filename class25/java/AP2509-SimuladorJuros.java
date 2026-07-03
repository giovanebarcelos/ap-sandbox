public class SimuladorJuros {
    public static void main(String[] x) {
        double capital = 1000, taxa = 0.01; int meses = 12;
        System.out.printf("Montante: %.2f%n", capital * Math.pow(1 + taxa, meses));
    }
}
