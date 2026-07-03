#include <iostream>
int main() {
    int a = 5, b = 8, temp;
    std::cout << "Antes: a=" << a << ", b=" << b << std::endl;
    temp = a; a = b; b = temp;
    std::cout << "Depois: a=" << a << ", b=" << b << std::endl;
    return 0;
}
