#include <iostream>
#include <iomanip>
int main() {
    double bruto;
    std::cout << "Salario bruto: ";
    std::cin >> bruto;
    double inss = bruto * 0.11;
    double ir = bruto * 0.075;
    double liquido = bruto - inss - ir;
    std::cout << std::fixed << std::setprecision(2);
    std::cout << "INSS (11%): " << inss << std::endl;
    std::cout << "IR (7,5%): " << ir << std::endl;
    std::cout << "Salario liquido: " << liquido << std::endl;
    return 0;
}
