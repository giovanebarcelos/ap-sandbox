#include <iostream>
#include <iomanip>
int main() {
    const int MAX = 5;
    double notas[MAX], soma = 0;
    for (int i = 0; i < MAX; i++) {
        std::cout << "Nota " << (i + 1) << ": ";
        std::cin >> notas[i];
        soma += notas[i];
    }
    std::cout << std::fixed << std::setprecision(1) << "Media: " << soma / MAX << std::endl;
    return 0;
}
