#include <iostream>
int main() {
    int n;
    std::cout << "Digite um número: "; std::cin >> n;
    while (n >= 0) { std::cout << n << std::endl; n--; }
    std::cout << "Fogo!" << std::endl;
    return 0;
}