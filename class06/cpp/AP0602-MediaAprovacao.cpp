#include <iostream>
#include <iomanip>
int main() {
    double n1, n2;
    std::cout << "Nota 1: ";
    std::cin >> n1;
    std::cout << "Nota 2: ";
    std::cin >> n2;
    double media = (n1 + n2) / 2;
    std::cout << std::fixed << std::setprecision(1) << "Media: " << media << std::endl;
    if (media >= 7) std::cout << "APROVADO" << std::endl;
    else if (media >= 5) std::cout << "RECUPERACAO" << std::endl;
    else std::cout << "REPROVADO" << std::endl;
    return 0;
}
