#include <iostream>
#include <string>
#include <algorithm>
int main() {
    std::string nome;
    std::cout << "Digite seu nome: ";
    std::getline(std::cin, nome);
    std::cout << "Ola, " << nome << "!" << std::endl;
    std::cout << "Seu nome tem " << nome.size() << " caracteres" << std::endl;
    std::string mai = nome, min = nome;
    std::transform(mai.begin(), mai.end(), mai.begin(), ::toupper);
    std::transform(min.begin(), min.end(), min.begin(), ::tolower);
    std::cout << "Em maiusculas: " << mai << std::endl;
    std::cout << "Em minusculas: " << min << std::endl;
    if (!nome.empty()) std::cout << "Primeira letra: " << nome[0] << std::endl;
    return 0;
}
