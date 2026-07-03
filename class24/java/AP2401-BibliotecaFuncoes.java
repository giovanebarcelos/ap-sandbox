public class BibliotecaFuncoes {
    static boolean ehPar(int n) {
        return n % 2 == 0;
    }

    static double imc(double peso, double altura) {
        return peso / (altura * altura);
    }

    static String classificaImc(double valor) {
        if (valor < 18.5) return "Abaixo do peso";
        if (valor < 25) return "Peso normal";
        if (valor < 30) return "Sobrepeso";
        return "Obesidade";
    }

    public static void main(String[] args) {
        System.out.println("10 e par? " + ehPar(10));   // true
        double valor = imc(70, 1.75);
        System.out.printf("IMC: %.1f - %s%n", valor, classificaImc(valor));
    }
}
