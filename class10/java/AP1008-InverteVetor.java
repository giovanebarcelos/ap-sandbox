public class InverteVetor {
    public static void main(String[] x) {
        int[] v = {1, 2, 3, 4, 5};
        System.out.print("Invertido: ");
        for (int i = v.length - 1; i >= 0; i--) System.out.print(v[i] + " ");
        System.out.println();
    }
}
