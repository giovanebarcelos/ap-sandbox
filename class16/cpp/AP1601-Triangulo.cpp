#include <iostream>
int main() {
    double a, b, c;
    std::cout << "Lado a: "; std::cin >> a;
    std::cout << "Lado b: "; std::cin >> b;
    std::cout << "Lado c: "; std::cin >> c;
    if (a < b + c && b < a + c && c < a + b) {
        if (a == b && b == c) std::cout << "Triangulo EQUILATERO" << std::endl;
        else if (a == b || b == c || a == c) std::cout << "Triangulo ISOSCELES" << std::endl;
        else std::cout << "Triangulo ESCALENO" << std::endl;
    } else {
        std::cout << "Nao formam um triangulo" << std::endl;
    }
    return 0;
}
