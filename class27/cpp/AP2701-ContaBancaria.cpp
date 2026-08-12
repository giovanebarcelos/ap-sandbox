#include <iostream>
#include <string>
using namespace std;

class ContaBancaria {
    public:
        string titular;
        double saldo = 0.0;

        void depositar(double valor) {
            saldo = saldo + valor;
        }

        bool sacar(double valor) {
            if (valor > saldo) {
                return false;
            }
            saldo = saldo - valor;
            return true;
        }

        double consultarSaldo() {
            return saldo;
        }
};

int main() {
    ContaBancaria conta1;
    conta1.titular = "Ana";
    conta1.depositar(500.0);

    ContaBancaria conta2;
    conta2.titular = "Beto";
    conta2.depositar(1200.0);

    cout << conta1.titular << ": " << conta1.consultarSaldo() << endl;
    cout << conta2.titular << ": " << conta2.consultarSaldo() << endl;

    conta1.sacar(200.0);
    cout << conta1.titular << " apos saque: " << conta1.consultarSaldo() << endl;
    return 0;
}
