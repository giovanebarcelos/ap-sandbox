#include <iostream>
int main() {
    double nota;
    std::cout << "Nota: "; std::cin >> nota;
    if (nota >= 7) std::cout << "Aprovado" << std::endl;
    else std::cout << "Reprovado" << std::endl;
    return 0;
}
