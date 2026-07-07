#include <iostream>
#include <iomanip>
int main() {
    int op;
    std::cout << "=== CONVERSOR ===\n1 - °C → °F\n2 - km → milhas\n3 - kg → libras" << std::endl;
    std::cout << "Escolha: "; std::cin >> op;
    std::cout << std::fixed << std::setprecision(2);
    switch (op) {
        case 1: { double c; std::cout << "°C: "; std::cin >> c;
            std::cout << c << "°C = " << std::setprecision(1) << c*9/5+32 << "°F" << std::endl; break; }
        case 2: { double km; std::cout << "km: "; std::cin >> km;
            std::cout << km << " km = " << km*0.6214 << " milhas" << std::endl; break; }
        case 3: { double kg; std::cout << "kg: "; std::cin >> kg;
            std::cout << kg << " kg = " << kg*2.2046 << " libras" << std::endl; break; }
        default: std::cout << "Opção inválida!" << std::endl;
    }
    return 0;
}