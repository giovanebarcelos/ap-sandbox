#include <iostream>
int main() {
    int inteiro = 42;
    double real = 3.14159;
    char caractere = 'A';
    bool logico = true;
    std::cout << "Inteiro (int): " << inteiro << std::endl;
    std::cout << "Real (double): " << real << std::endl;
    std::cout << "Caractere (char): " << caractere << std::endl;
    std::cout << "Lógico (bool): " << std::boolalpha << logico << std::endl;
    return 0;
}