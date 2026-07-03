public class Potencia {
    public static void main(String[] x) {
        int base = 2, exp = 10, r = 1;
        for (int i = 0; i < exp; i++) r *= base;
        System.out.println(base + "^" + exp + " = " + r);
    }
}
