#include <iostream>
int main() {
    double notas[5] = {7.5, 8.0, 6.5, 9.0, 7.0};
    notas[0] = 10.0;   // altera o primeiro elemento
    std::cout << "Terceiro elemento (indice 2): " << notas[2] << std::endl;
    std::cout << "Vetor completo: ";
    for (int i = 0; i < 5; i++) std::cout << notas[i] << " ";
    std::cout << std::endl;
    std::cout << "Tamanho: 5" << std::endl;
    return 0;
}
