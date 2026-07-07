#include <iostream>
int main() {
    int dia;
    std::cout << "Digite um número (1-7): "; std::cin >> dia;
    switch (dia) {
        case 1: std::cout << "Domingo" << std::endl; break;
        case 2: std::cout << "Segunda-feira" << std::endl; break;
        case 3: std::cout << "Terça-feira" << std::endl; break;
        case 4: std::cout << "Quarta-feira" << std::endl; break;
        case 5: std::cout << "Quinta-feira" << std::endl; break;
        case 6: std::cout << "Sexta-feira" << std::endl; break;
        case 7: std::cout << "Sábado" << std::endl; break;
        default: std::cout << "Número inválido! Digite 1-7." << std::endl;
    }
    return 0;
}