class ValorInvalidoException extends RuntimeException {
    ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}

public class Main {
    static double dividir(double a, double b) {
        return a / b;
    }

    static double depositar(double saldo, double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException("valor deve ser positivo");
        }
        return saldo + valor;
    }

    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisao por zero");
        }

        try {
            double novoSaldo = depositar(100.0, -50.0);
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Programa continuou rodando normalmente");
    }
}
