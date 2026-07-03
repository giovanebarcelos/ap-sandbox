public class ConceitoNota {
    public static void main(String[] x) {
        int nota = 85; String c;
        if (nota >= 90) c = "A"; else if (nota >= 80) c = "B";
        else if (nota >= 70) c = "C"; else if (nota >= 60) c = "D"; else c = "F";
        System.out.println("Conceito: " + c);
    }
}
