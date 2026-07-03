#include <iostream>
#include <iomanip>
int main() {
    double a, b;
    std::cout << "N1: "; std::cin >> a;
    std::cout << "N2: "; std::cin >> b;
    std::cout << std::fixed << std::setprecision(2);
    std::cout << "Soma: " << a+b << " Sub: " << a-b << " Mult: " << a*b << " Div: " << a/b << std::endl;
    return 0;
}
