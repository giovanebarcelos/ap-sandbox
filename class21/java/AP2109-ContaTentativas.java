public class ContaTentativas {
    public static void main(String[] x) {
        int secreto = 42; int[] palpites = {50, 25, 40, 42}; int tent = 0;
        for (int p : palpites) { tent++; if (p == secreto) break; }
        System.out.println("Acertou em " + tent + " tentativas");
    }
}
