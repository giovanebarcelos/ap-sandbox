import java.util.Random;
public class SorteioNumero {
    public static void main(String[] x) {
        int secreto = new Random().nextInt(100) + 1;
        System.out.println("Numero secreto: " + secreto);
    }
}
