public class ValidaSenha {
    static boolean senhaForte(String s) { return s.length() >= 8; }
    public static void main(String[] x) {
        System.out.println("12345678 forte? " + senhaForte("12345678"));
        System.out.println("123 forte? " + senhaForte("123"));
    }
}
