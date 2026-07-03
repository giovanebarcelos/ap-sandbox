#include <iostream>
int main() {
    double a, b;
    std::string op;
    std::cout << "Primeiro numero: ";
    std::cin >> a;
    std::cout << "Operacao (+ - * /): ";
    std::cin >> op;
    std::cout << "Segundo numero: ";
    std::cin >> b;
    if (op == "+") std::cout << "Resultado: " << (a + b) << std::endl;
    else if (op == "-") std::cout << "Resultado: " << (a - b) << std::endl;
    else if (op == "*") std::cout << "Resultado: " << (a * b) << std::endl;
    else if (op == "/") {
        if (b != 0) std::cout << "Resultado: " << (a / b) << std::endl;
        else std::cout << "Erro: divisao por zero" << std::endl;
    } else std::cout << "Operacao invalida" << std::endl;
    return 0;
}
