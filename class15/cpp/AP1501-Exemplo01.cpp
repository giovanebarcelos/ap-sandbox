#include <iostream>
int main() {
    int idade;
    std::cout << "Idade: "; std::cin >> idade;
    if (idade < 0) std::cout << "Idade inválida!" << std::endl;
    else if (idade <= 12) std::cout << "Criança" << std::endl;
    else if (idade <= 17) std::cout << "Adolescente" << std::endl;
    else if (idade <= 59) std::cout << "Adulto" << std::endl;
    else if (idade <= 120) std::cout << "Idoso" << std::endl;
    else std::cout << "Idade improvável!" << std::endl;
    return 0;
}