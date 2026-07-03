public class Bhaskara {
    public static void main(String[] x) {
        double a = 1, b = -5, c = 6;
        double delta = b*b - 4*a*c;
        if (delta >= 0) {
            System.out.println("Raizes: " + (-b + Math.sqrt(delta))/(2*a) + " e " + (-b - Math.sqrt(delta))/(2*a));
        } else System.out.println("Sem raizes reais");
    }
}
