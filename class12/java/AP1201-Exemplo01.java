public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("a + b * c = " + (a + b * c) + "   (multiplicação antes da soma)");
        System.out.println("(a + b) * c = " + ((a + b) * c) + " (parênteses alteram a ordem)");
        System.out.println("a > b && b > c = " + (a > b && b > c) + " (relacionais antes do lógico)");
        System.out.println("! (a < b) || c > 0 = " + (!(a < b) || c > 0) + " (NOT antes do OR)");
    }
}