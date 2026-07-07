#include <iostream>
int main() {
    int x = 5, y = 10;
    std::cout << "Antes: x=" << x << ", y=" << y << std::endl;
    x = x + y; y = x - y; x = x - y;
    std::cout << "Depois da troca: x=" << x << ", y=" << y << std::endl;
    std::cout << "Os valores foram trocados sem variável extra!" << std::endl;
    return 0;
}