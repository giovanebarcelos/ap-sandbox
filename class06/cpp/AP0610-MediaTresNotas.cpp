#include <iostream>
#include <iomanip>
int main() {
    double n1, n2, n3;
    std::cout << "Nota 1: "; std::cin >> n1;
    std::cout << "Nota 2: "; std::cin >> n2;
    std::cout << "Nota 3: "; std::cin >> n3;
    std::cout << "Média: " << std::fixed << std::setprecision(1) << (n1+n2+n3)/3 << std::endl;
    return 0;
}