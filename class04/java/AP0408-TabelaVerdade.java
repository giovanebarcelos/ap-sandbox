public class TabelaVerdade {
    public static void main(String[] x) {
        boolean[] v = {true, false};
        System.out.println("A B | AeB | AouB");
        for (boolean a : v) for (boolean b : v)
            System.out.println((a?1:0)+" "+(b?1:0)+" | "+((a&&b)?1:0)+"   | "+((a||b)?1:0));
    }
}
