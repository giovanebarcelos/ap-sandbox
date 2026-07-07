#include <iostream>
#include <iomanip>
const double PI = 3.14159;
double calcularArea(double raio) {
    double area = PI * raio * raio;
    return area;
}
int main() {
    double raio;
    std::cout << "Constante PI = " << PI << " (acessível em todo o programa)" << std::endl;
    std::cout << "Digite o raio: "; std::cin >> raio;
    std::cout << "Área do círculo: " << std::fixed << std::setprecision(2) << calcularArea(raio) << std::endl;
    return 0;
}