#include <iostream>
#include <iomanip>
#include <cmath>
double potencia(double base, int exp) {
    if (exp == 0) return 1;
    double res = 1;
    for (int i = 0; i < abs(exp); i++) res *= base;
    return exp < 0 ? 1/res : res;
}
int main() {
    double b; int e;
    std::cout << "Base: "; std::cin >> b;
    std::cout << "Expoente: "; std::cin >> e;
    std::cout << b << "^" << e << " = " << std::fixed << std::setprecision(4) << potencia(b, e) << std::endl;
    return 0;
}