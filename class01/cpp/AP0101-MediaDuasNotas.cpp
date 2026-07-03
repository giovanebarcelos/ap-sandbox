#include <iostream>
#include <iomanip>
int main() {
    double nota1, nota2;
    std::cout << "Digite a primeira nota: ";
    std::cin >> nota1;
    std::cout << "Digite a segunda nota: ";
    std::cin >> nota2;
    double media = (nota1 + nota2) / 2;
    std::cout << std::fixed << std::setprecision(1) << "Media: " << media << std::endl;
    std::cout << (media >= 7 ? "Aprovado" : "Reprovado") << std::endl;
    return 0;
}
