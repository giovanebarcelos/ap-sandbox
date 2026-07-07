#include <iostream>
#include <iomanip>
int main() {
    int op; double a, b;
    std::cout << "=== CALCULADORA ===" << std::endl;
    std::cout << "1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir" << std::endl;
    std::cout << "Escolha: "; std::cin >> op;
    std::cout << "Número 1: "; std::cin >> a;
    std::cout << "Número 2: "; std::cin >> b;
    switch (op) {
        case 1: std::cout << a << " + " << b << " = " << a+b << std::endl; break;
        case 2: std::cout << a << " - " << b << " = " << a-b << std::endl; break;
        case 3: std::cout << a << " × " << b << " = " << a*b << std::endl; break;
        case 4:
            if (b!=0) std::cout << a << " ÷ " << b << " = " << std::fixed << std::setprecision(2) << a/b << std::endl;
            else std::cout << "Erro: divisão por zero!" << std::endl;
            break;
        default: std::cout << "Opção inválida!" << std::endl;
    }
    return 0;
}