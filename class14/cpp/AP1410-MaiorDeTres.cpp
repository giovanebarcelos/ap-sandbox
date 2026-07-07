#include <iostream>
int main() {
    double a, b, c, maior;
    std::cout << "Número 1: "; std::cin >> a;
    std::cout << "Número 2: "; std::cin >> b;
    std::cout << "Número 3: "; std::cin >> c;
    if (a >= b && a >= c) maior = a;
    else if (b >= c) maior = b;
    else maior = c;
    std::cout << "O maior número é " << maior << std::endl;
    return 0;
}