#include <iostream>
int main() {
    double num;
    std::cout << "Digite um número: "; std::cin >> num;
    if (num > 0) std::cout << num << " é POSITIVO" << std::endl;
    else if (num < 0) std::cout << num << " é NEGATIVO" << std::endl;
    else std::cout << "O número é ZERO" << std::endl;
    return 0;
}