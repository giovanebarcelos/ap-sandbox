public class PadraoAsteriscos {
    public static void main(String[] args) {
        final int N = 5;
        // Triangulo crescente (loops aninhados)
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println();
        // Triangulo decrescente
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
