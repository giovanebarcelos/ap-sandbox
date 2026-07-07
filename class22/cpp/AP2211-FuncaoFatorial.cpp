#include <iostream>
long long fatorial(int n) {
    if (n < 0) return -1;
    long long fat = 1;
    for (int i = 2; i <= n; i++) fat *= i;
    return fat;
}
int main() {
    int n;
    std::cout << "Digite um número: "; std::cin >> n;
    long long fat = fatorial(n);
    if (fat == -1) std::cout << "Não existe fatorial de número negativo!" << std::endl;
    else std::cout << n << "! = " << fat << std::endl;
    return 0;
}