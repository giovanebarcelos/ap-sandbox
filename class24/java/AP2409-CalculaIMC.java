public class CalculaIMC {
    static double imc(double peso, double altura) { return peso / (altura * altura); }
    public static void main(String[] x) { System.out.printf("IMC: %.1f%n", imc(70, 1.75)); }
}
