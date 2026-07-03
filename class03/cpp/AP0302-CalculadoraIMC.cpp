#include <iostream>
#include <iomanip>
int main() {
    double peso, altura;
    std::cout << "Peso (kg): "; std::cin >> peso;
    std::cout << "Altura (m): "; std::cin >> altura;
    double imc = peso / (altura * altura);
    std::cout << "IMC: " << std::fixed << std::setprecision(1) << imc << std::endl;
    if (imc < 18.5) std::cout << "Abaixo do peso" << std::endl;
    else if (imc < 25) std::cout << "Peso normal" << std::endl;
    else if (imc < 30) std::cout << "Sobrepeso" << std::endl;
    else std::cout << "Obesidade" << std::endl;
    return 0;
}
