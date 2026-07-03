#include <iostream>
int main() {
    int idade; char titulo;
    std::cout << "Idade: "; std::cin >> idade;
    std::cout << "Tem titulo? (s/n): "; std::cin >> titulo;
    if (idade >= 16 && (titulo == 's' || titulo == 'S'))
        std::cout << "Pode votar" << std::endl;
    else std::cout << "Nao pode votar" << std::endl;
    return 0;
}
