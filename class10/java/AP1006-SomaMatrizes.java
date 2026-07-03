public class SomaMatrizes {
    public static void main(String[] args) {
        final int LIN = 2, COL = 3;
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{10, 20, 30}, {40, 50, 60}};
        int[][] c = new int[LIN][COL];
        for (int i = 0; i < LIN; i++)
            for (int j = 0; j < COL; j++)
                c[i][j] = a[i][j] + b[i][j];
        System.out.println("Matriz soma:");
        for (int i = 0; i < LIN; i++) {
            for (int j = 0; j < COL; j++) System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}
