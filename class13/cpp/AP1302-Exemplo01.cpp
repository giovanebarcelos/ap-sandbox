#include <iostream>
#include <iomanip>
int main() {
    double peso, altura;
    std::cout << "Peso (kg): "; std::cin >> peso;
    std::cout << "Altura (m): "; std::cin >> altura;
    double imc = peso / (altura * altura);
    std::cout << "IMC: " << std::fixed << std::setprecision(1) << imc << std::endl;
    if (imc < 18.5) std::cout << "Classificação: Abaixo do peso" << std::endl;
    else if (imc < 25) std::cout << "Classificação: Peso normal" << std::endl;
    else if (imc < 30) std::cout << "Classificação: Sobrepeso" << std::endl;
    else std::cout << "Classificação: Obesidade" << std::endl;
    return 0;
}