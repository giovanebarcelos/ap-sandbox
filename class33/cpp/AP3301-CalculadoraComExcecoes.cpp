#include <iostream>
#include <stdexcept>
using namespace std;

double depositar(double saldo, double valor) {
    if (valor <= 0) {
        throw invalid_argument("valor deve ser positivo");
    }
    return saldo + valor;
}

int main() {
    try {
        int divisor = 0;
        if (divisor == 0) {
            throw runtime_error("divisao por zero");
        }
        int resultado = 10 / divisor;
    } catch (const runtime_error& e) {
        cout << "Erro: " << e.what() << endl;
    }

    try {
        double novoSaldo = depositar(100.0, -50.0);
    } catch (const invalid_argument& e) {
        cout << "Erro: " << e.what() << endl;
    }

    cout << "Programa continuou rodando normalmente" << endl;
    return 0;
}
