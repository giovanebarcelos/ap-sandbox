#include <iostream>
#include <iomanip>
#include <string>

bool ehPar(int n) { return n % 2 == 0; }

double imc(double peso, double altura) { return peso / (altura * altura); }

std::string classificaImc(double valor) {
    if (valor < 18.5) return "Abaixo do peso";
    if (valor < 25) return "Peso normal";
    if (valor < 30) return "Sobrepeso";
    return "Obesidade";
}

int main() {
    std::cout << "10 e par? " << (ehPar(10) ? "sim" : "nao") << std::endl;
    double valor = imc(70, 1.75);
    std::cout << std::fixed << std::setprecision(1)
              << "IMC: " << valor << " - " << classificaImc(valor) << std::endl;
    return 0;
}
