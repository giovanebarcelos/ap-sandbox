#include <iostream>
#include <iomanip>
int main() {
    double valor = 9.75;
    int inteiro = (int)valor;
    std::cout << "Valor original (double): " << valor << std::endl;
    std::cout << "Após casting para int: " << inteiro << std::endl;
    std::cout << "Diferença: " << std::fixed << std::setprecision(2) << (valor-inteiro) << " (parte decimal perdida)" << std::endl;
    return 0;
}