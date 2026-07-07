#include <iostream>
#include <iomanip>
int main() {
    int n, num = 1;
    std::cout << "Número de linhas: "; std::cin >> n;
    for (int i = 1; i <= n; i++) {
        for (int j = 0; j < i; j++)
            std::cout << std::setw(3) << num++;
        std::cout << std::endl;
    }
    return 0;
}