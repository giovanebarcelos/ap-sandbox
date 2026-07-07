public class CastingTipos {
    public static void main(String[] args) {
        double valor = 9.75;
        int inteiro = (int) valor;
        System.out.println("Valor original (double): " + valor);
        System.out.println("Após casting para int: " + inteiro);
        System.out.printf("Diferença: %.2f (parte decimal perdida)%n", valor - inteiro);
    }
}