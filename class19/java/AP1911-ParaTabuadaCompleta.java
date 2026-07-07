public class ParaTabuadaCompleta {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++)
                System.out.printf("  %2d × %2d = %3d%n", i, j, i*j);
            System.out.println();
        }
    }
}