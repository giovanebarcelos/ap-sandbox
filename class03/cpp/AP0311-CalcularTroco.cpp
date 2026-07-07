#include <iostream>
#include <iomanip>
int main() {
    double valor, pago;
    std::cout << "Valor da compra: R$ "; std::cin >> valor;
    std::cout << "Valor pago: R$ "; std::cin >> pago;
    double troco = pago - valor;
    if (troco < 0) std::cout << "Dinheiro insuficiente!" << std::endl;
    else std::cout << "Troco: R$ " << std::fixed << std::setprecision(2) << troco << std::endl;
    return 0;
}