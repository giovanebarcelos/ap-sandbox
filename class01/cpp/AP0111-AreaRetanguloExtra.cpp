#include <iostream>
#include <iomanip>
int main() {
    double base, altura;
    std::cout << "Digite a base: "; std::cin >> base;
    std::cout << "Digite a altura: "; std::cin >> altura;
    double area = base * altura;
    std::cout << "A área do retângulo é " << std::fixed << std::setprecision(2) << area << std::endl;
    return 0;
}