#include <iostream>
#include <iomanip>
int main() {
    double a, b;
    std::cout << "Primeiro número: "; std::cin >> a;
    std::cout << "Segundo número: "; std::cin >> b;
    std::cout << "Soma: " << a+b << std::endl;
    std::cout << "Subtração: " << a-b << std::endl;
    std::cout << "Multiplicação: " << a*b << std::endl;
    if (b != 0) std::cout << "Divisão: " << std::fixed << std::setprecision(2) << a/b << std::endl;
    else std::cout << "Divisão: Não é possível dividir por zero" << std::endl;
    return 0;
}