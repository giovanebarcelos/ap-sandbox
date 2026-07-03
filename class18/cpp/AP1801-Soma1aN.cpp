#include <iostream>
int main() {
    int n, soma = 0;
    std::cout << "N: "; std::cin >> n;
    for (int i = 1; i <= n; i++) soma += i;
    std::cout << "Soma = " << soma << std::endl;
    return 0;
}
