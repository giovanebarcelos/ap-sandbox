#include <iostream>
#include <cmath>
bool ehPrimo(int n) {
    if (n < 2) return false;
    for (int i = 2; i <= sqrt(n); i++)
        if (n % i == 0) return false;
    return true;
}
int main() {
    int n;
    std::cout << "Digite um número: "; std::cin >> n;
    if (ehPrimo(n)) std::cout << n << " é PRIMO!" << std::endl;
    else std::cout << n << " NÃO é primo." << std::endl;
    return 0;
}