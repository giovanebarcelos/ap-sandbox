#include <iostream>
#include <iomanip>
int main() {
    double c;
    std::cout << "Temperatura em °C: "; std::cin >> c;
    std::cout << std::fixed << std::setprecision(1);
    std::cout << c << "°C = " << (c*9/5+32) << "°F" << std::endl;
    return 0;
}