public class TabuadaMatriz {
    public static void main(String[] args) {
        final int N = 10;
        int[][] m = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                m[i][j] = (i + 1) * (j + 1);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) System.out.printf("%4d", m[i][j]);
            System.out.println();
        }
    }
}
