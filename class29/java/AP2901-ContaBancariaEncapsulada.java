class ContaBancaria {
    private double saldo;

    ContaBancaria() {
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }
        saldo = saldo + valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            return false;
        }
        saldo = saldo - valor;
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(500.0);
        System.out.println("Saldo: " + conta.getSaldo());

        boolean ok = conta.depositar(-100.0);
        System.out.println("Deposito negativo aceito? " + ok);

        conta.sacar(200.0);
        System.out.println("Saldo apos saque: " + conta.getSaldo());
    }
}
