public class TabelaVerdadeAND {
    public static void main(String[] args) {
        System.out.println("A     | B     | A AND B");
        System.out.println("------+-------+-------");
        boolean[] vals = {true, false};
        for (boolean a : vals)
            for (boolean b : vals)
                System.out.printf("%-5s | %-5s | %s%n", a, b, a && b);
    }
}