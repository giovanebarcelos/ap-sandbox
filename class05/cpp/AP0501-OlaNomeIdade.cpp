#include <iostream>
#include <string>
int main() {
    std::string nome; int idade;
    std::cout << "Nome: "; std::getline(std::cin, nome);
    std::cout << "Idade: "; std::cin >> idade;
    std::cout << "Ola, " << nome << "! Voce tem " << idade << " anos." << std::endl;
    return 0;
}
