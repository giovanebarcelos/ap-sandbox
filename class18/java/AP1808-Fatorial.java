public class Fatorial {
    public static void main(String[] x) {
        int n = 5; long f = 1; int i = 2;
        while (i <= n) { f *= i; i++; }
        System.out.println(n + "! = " + f);
    }
}
