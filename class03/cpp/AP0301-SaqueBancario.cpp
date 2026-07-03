#include <iostream>
#include <iomanip>
int main() {
    double saldo, saque;
    std::cout << "Saldo: R$ "; std::cin >> saldo;
    std::cout << "Saque: R$ "; std::cin >> saque;
    if (saque > saldo) std::cout << "Saldo insuficiente" << std::endl;
    else if ((int)saque % 10 != 0) std::cout << "Use multiplos de R$10" << std::endl;
    else { saldo -= saque; std::cout << "Saque liberado! Saldo: R$ " << std::fixed << std::setprecision(2) << saldo << std::endl; }
    return 0;
}
