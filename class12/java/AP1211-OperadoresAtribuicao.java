public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Valor inicial: x = " + x);
        x += 5; System.out.println("x += 5  → x = " + x);
        x -= 3; System.out.println("x -= 3  → x = " + x);
        x *= 2; System.out.println("x *= 2  → x = " + x);
        x /= 4; System.out.println("x /= 4  → x = " + x);
        x %= 3; System.out.println("x %= 3  → x = " + x);
    }
}