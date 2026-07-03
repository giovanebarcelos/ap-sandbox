public class FuncaoDobro {
    static int dobro(int n) { return n * 2; }
    public static void main(String[] x) {
        System.out.println("dobro(7) = " + dobro(7));
        System.out.println("dobro(dobro(3)) = " + dobro(dobro(3)));
    }
}
