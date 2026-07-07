#include <iostream>
int main() {
    int x = 10;
    std::cout << "Valor inicial: x = " << x << std::endl;
    x += 5; std::cout << "x += 5  → x = " << x << std::endl;
    x -= 3; std::cout << "x -= 3  → x = " << x << std::endl;
    x *= 2; std::cout << "x *= 2  → x = " << x << std::endl;
    x /= 4; std::cout << "x /= 4  → x = " << x << std::endl;
    x %= 3; std::cout << "x %= 3  → x = " << x << std::endl;
    return 0;
}