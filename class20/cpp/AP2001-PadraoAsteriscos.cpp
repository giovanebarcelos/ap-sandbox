#include <iostream>
int main() {
    const int N = 5;
    // Triangulo crescente (loops aninhados)
    for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= i; j++) std::cout << "*";
        std::cout << "\n";
    }
    std::cout << "\n";
    // Triangulo decrescente
    for (int i = N; i >= 1; i--) {
        for (int j = 1; j <= i; j++) std::cout << "*";
        std::cout << "\n";
    }
    return 0;
}
