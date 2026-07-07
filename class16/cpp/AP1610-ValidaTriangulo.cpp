#include <iostream>
int main() {
    double a, b, c;
    std::cout << "Lado A: "; std::cin >> a;
    std::cout << "Lado B: "; std::cin >> b;
    std::cout << "Lado C: "; std::cin >> c;
    if (a+b>c && a+c>b && b+c>a) {
        std::cout << "É um triângulo!" << std::endl;
        if (a==b && b==c) std::cout << "Tipo: Equilátero" << std::endl;
        else if (a==b || a==c || b==c) std::cout << "Tipo: Isósceles" << std::endl;
        else std::cout << "Tipo: Escaleno" << std::endl;
    } else std::cout << "Não forma um triângulo." << std::endl;
    return 0;
}