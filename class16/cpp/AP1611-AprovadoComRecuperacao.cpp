#include <iostream>
int main() {
    double nota, freq;
    std::cout << "Nota final: "; std::cin >> nota;
    std::cout << "Frequência (%): "; std::cin >> freq;
    if (nota >= 70 && freq >= 75) std::cout << "APROVADO!" << std::endl;
    else if (nota >= 40 && freq >= 75) std::cout << "RECUPERAÇÃO" << std::endl;
    else std::cout << "REPROVADO" << std::endl;
    std::cout << "Nota: " << nota << " | Frequência: " << freq << "%" << std::endl;
    return 0;
}