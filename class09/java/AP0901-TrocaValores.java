public class Troca {
    public static void main(String[] args) {
        int a = 5, b = 8, temp;
        System.out.println("Antes: a=" + a + ", b=" + b);
        temp = a; a = b; b = temp;
        System.out.println("Depois: a=" + a + ", b=" + b);
    }
}
