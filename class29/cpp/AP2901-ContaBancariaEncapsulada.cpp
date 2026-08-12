#include <iostream>
using namespace std;

class ContaBancaria {
    private:
        double saldo = 0.0;

    public:
        double getSaldo() {
            return saldo;
        }

        bool depositar(double valor) {
            if (valor <= 0) return false;
            saldo = saldo + valor;
            return true;
        }

        bool sacar(double valor) {
            if (valor <= 0 || valor > saldo) return false;
            saldo = saldo - valor;
            return true;
        }
};

int main() {
    ContaBancaria conta;
    conta.depositar(500.0);
    cout << "Saldo: " << conta.getSaldo() << endl;

    bool ok = conta.depositar(-100.0);
    cout << "Deposito negativo aceito? " << (ok ? "sim" : "nao") << endl;

    conta.sacar(200.0);
    cout << "Saldo apos saque: " << conta.getSaldo() << endl;
    return 0;
}
