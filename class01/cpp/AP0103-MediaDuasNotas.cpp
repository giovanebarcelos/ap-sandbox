#include <iostream>
#include <iomanip>
int main() {
    double n1, n2;
    std::cout << "Nota 1: "; std::cin >> n1;
    std::cout << "Nota 2: "; std::cin >> n2;
    double media = (n1 + n2) / 2;
    std::cout << "Media: " << std::fixed << std::setprecision(1) << media << std::endl;
    if (media >= 7) std::cout << "Aprovado" << std::endl;
    else std::cout << "Reprovado" << std::endl;
    return 0;
}
