#include <iostream>
#include <iomanip>
int main() {
    double soma = 0, n;
    while (true) {
        std::cout << "Digite um número (0 para sair): "; std::cin >> n;
        if (n == 0) break;
        soma += n;
    }
    std::cout << "Soma total: " << std::fixed << std::setprecision(2) << soma << std::endl;
    return 0;
}