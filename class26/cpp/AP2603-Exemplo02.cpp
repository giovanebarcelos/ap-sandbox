#include <iostream>
#include <string>
int main() {
    std::string nome, ling, anos;
    std::cout << "=== MINI CURRÍCULO DE PROGRAMADOR ===" << std::endl;
    std::cout << "Nome: "; std::getline(std::cin, nome);
    std::cout << "Principal linguagem: "; std::getline(std::cin, ling);
    std::cout << "Anos de experiência: "; std::getline(std::cin, anos);
    std::cout << "\n" << nome << " | " << ling << " | " << anos << " anos" << std::endl;
    std::cout << "Habilidades: Lógica, Algoritmos, Estruturas de Dados" << std::endl;
    std::cout << "\"Qualquer um pode programar. Basta começar.\"" << std::endl;
    return 0;
}