public class PegadaCarbono {
    public static void main(String[] x) {
        double kmCarro = 300, kwh = 200;
        double co2 = kmCarro * 0.12 + kwh * 0.09;
        System.out.printf("Pegada estimada: %.1f kg CO2/mes%n", co2);
    }
}
