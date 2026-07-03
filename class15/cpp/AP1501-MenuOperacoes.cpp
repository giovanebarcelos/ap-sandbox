#include <iostream>
int main() {
    int opcao;
    double a, b;
    std::cout << "1 - Somar\n2 - Subtrair\n3 - Multiplicar\n";
    std::cout << "Escolha uma opcao: ";
    std::cin >> opcao;
    std::cout << "Primeiro numero: ";
    std::cin >> a;
    std::cout << "Segundo numero: ";
    std::cin >> b;
    switch (opcao) {
        case 1: std::cout << "Resultado: " << (a + b) << std::endl; break;
        case 2: std::cout << "Resultado: " << (a - b) << std::endl; break;
        case 3: std::cout << "Resultado: " << (a * b) << std::endl; break;
        default: std::cout << "Opcao invalida" << std::endl;
    }
    return 0;
}
