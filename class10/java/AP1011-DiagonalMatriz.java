public class DiagonalMatriz {
    public static void main(String[] args) {
        int[][] matriz = {{5, 2, 8}, {3, 7, 1}, {9, 4, 6}};
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matriz[i][j] + "  ");
            System.out.println();
        }
        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < 3; i++)
            System.out.println("  m[" + i + "][" + i + "] = " + matriz[i][i]);
    }
}