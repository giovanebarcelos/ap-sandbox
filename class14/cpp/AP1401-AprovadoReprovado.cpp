#include <iostream>
int main() {
    double media;
    std::cout << "Digite a media do aluno: ";
    std::cin >> media;
    if (media >= 7) std::cout << "APROVADO" << std::endl;
    else std::cout << "REPROVADO" << std::endl;
    return 0;
}
