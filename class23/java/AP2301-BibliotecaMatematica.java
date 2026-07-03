public class BibliotecaMatematica {
    static long fatorial(int n) {
        long r = 1;
        for (int i = 2; i <= n; i++) r *= i;
        return r;
    }

    static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    static int mdc(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("5! = " + fatorial(5));         // 120
        System.out.println("7 e primo? " + ehPrimo(7));    // true
        System.out.println("mdc(12, 18) = " + mdc(12, 18)); // 6
    }
}
