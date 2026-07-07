#include <iostream>
int main() {
    int num;
    std::cout << "Digite um número: "; std::cin >> num;
    if (num % 2 == 0) std::cout << num << " é PAR" << std::endl;
    else std::cout << num << " é ÍMPAR" << std::endl;
    return 0;
}