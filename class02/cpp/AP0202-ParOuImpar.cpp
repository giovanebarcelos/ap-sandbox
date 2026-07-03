#include <iostream>
int main() {
    int num;
    std::cout << "Numero: "; std::cin >> num;
    if (num % 2 == 0) std::cout << "Par" << std::endl;
    else std::cout << "Impar" << std::endl;
    return 0;
}
