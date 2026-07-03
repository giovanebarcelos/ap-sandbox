#include <iostream>
int main() {
    int idade;
    std::cout << "Idade: "; std::cin >> idade;
    if (idade < 12) std::cout << "Crianca" << std::endl;
    else if (idade < 18) std::cout << "Adolescente" << std::endl;
    else if (idade < 60) std::cout << "Adulto" << std::endl;
    else std::cout << "Idoso" << std::endl;
    return 0;
}
