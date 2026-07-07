#include <iostream>
#include <iomanip>
int main() {
    int n;
    std::cout << "Digite um número: "; std::cin >> n;
    int i = 1;
    while (i <= 10) {
        std::cout << n << " × " << std::setw(2) << i << " = " << std::setw(3) << n*i << std::endl;
        i++;
    }
    return 0;
}