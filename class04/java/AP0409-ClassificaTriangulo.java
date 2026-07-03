public class ClassificaTriangulo {
    public static void main(String[] x) {
        int a = 3, b = 3, c = 5;
        if (a == b && b == c) System.out.println("Equilatero");
        else if (a == b || b == c || a == c) System.out.println("Isosceles");
        else System.out.println("Escaleno");
    }
}
