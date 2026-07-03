#include <iostream>
int main() {
    int n;
    std::cout << "Digite um numero inteiro: ";
    std::cin >> n;
    std::cout << n << (n % 2 == 0 ? " e PAR" : " e IMPAR") << std::endl;
    return 0;
}
