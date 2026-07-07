#include <iostream>
#include <iomanip>
int main() {
    double km, litros;
    std::cout << "Distância percorrida (km): "; std::cin >> km;
    std::cout << "Combustível gasto (L): "; std::cin >> litros;
    std::cout << "Consumo médio: " << std::fixed << std::setprecision(1) << km/litros << " km/L" << std::endl;
    return 0;
}