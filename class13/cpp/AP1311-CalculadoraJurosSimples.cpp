#include <iostream>
#include <iomanip>
int main() {
    double c, i; int t;
    std::cout << "Capital inicial: R$ "; std::cin >> c;
    std::cout << "Taxa de juros mensal (%): "; std::cin >> i;
    std::cout << "Tempo (meses): "; std::cin >> t;
    double juros = c * (i/100) * t;
    std::cout << std::fixed << std::setprecision(2);
    std::cout << "Juros: R$ " << juros << std::endl;
    std::cout << "Montante final: R$ " << c+juros << std::endl;
    return 0;
}