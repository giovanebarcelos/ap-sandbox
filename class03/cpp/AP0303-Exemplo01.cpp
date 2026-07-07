#include <iostream>
#include <string>
int main() {
    std::string resp;
    std::cout << "Passo 1: Pegar uma lâmpada nova." << std::endl;
    std::cout << "Passo 2: Subir na escada com cuidado." << std::endl;
    std::cout << "A energia está desligada? (s/n): "; std::cin >> resp;
    if (resp == "s" || resp == "S") {
        std::cout << "Passo 3: Retirar lâmpada queimada." << std::endl;
        std::cout << "Passo 4: Rosquear lâmpada nova." << std::endl;
        std::cout << "Passo 5: Ligar interruptor para testar." << std::endl;
    } else std::cout << "Desligue a energia primeiro!" << std::endl;
    return 0;
}