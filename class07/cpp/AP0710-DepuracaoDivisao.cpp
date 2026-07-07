#include <iostream>
#include <iomanip>
int main() {
    double a, b;
    std::cout << "Numerador: "; std::cin >> a;
    std::cout << "Denominador: "; std::cin >> b;
    if (b == 0) std::cout << "Erro: divisão por zero!" << std::endl;
    else std::cout << "Resultado: " << std::fixed << std::setprecision(2) << a/b << std::endl;
    return 0;
}