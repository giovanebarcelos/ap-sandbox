public class ConversaoTipos {
    public static void main(String[] args) {
        String texto = "42";
        int numero = Integer.parseInt(texto);      // String -> int
        System.out.println(numero + 8);            // 50

        double real = Double.parseDouble("3.14");  // String -> double
        System.out.println(real * 2);              // 6.28

        int inteiro = (int) 9.99;                  // double -> int (trunca)
        System.out.println(inteiro);               // 9

        String comoTexto = String.valueOf(2026);   // int -> String
        System.out.println("Ano: " + comoTexto);
    }
}
