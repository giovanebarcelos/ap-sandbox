public class MatrizBasica {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3},
                     {4, 5, 6}};
        System.out.println("m[0][2] = " + m[0][2]);   // 3
        System.out.println("m[1][0] = " + m[1][0]);   // 4
        System.out.println("Matriz completa:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
