class ContaBancaria {
    String titular;
    double saldo = 0.0;

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        }
        saldo = saldo - valor;
        return true;
    }

    double consultarSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Ana";
        conta1.depositar(500.0);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.titular = "Beto";
        conta2.depositar(1200.0);

        System.out.println(conta1.titular + ": " + conta1.consultarSaldo());
        System.out.println(conta2.titular + ": " + conta2.consultarSaldo());

        conta1.sacar(200.0);
        System.out.println(conta1.titular + " apos saque: " + conta1.consultarSaldo());
    }
}
