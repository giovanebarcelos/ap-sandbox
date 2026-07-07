#include <iostream>
int main() {
    int a = 10, b = 5, c = 2;
    std::cout << "a=" << a << ", b=" << b << ", c=" << c << std::endl;
    std::cout << "a + b * c = " << a+b*c << "   (multiplicação antes da soma)" << std::endl;
    std::cout << "(a + b) * c = " << (a+b)*c << " (parênteses alteram a ordem)" << std::endl;
    std::cout << std::boolalpha;
    std::cout << "a > b && b > c = " << (a>b && b>c) << " (relacionais antes do lógico)" << std::endl;
    std::cout << "! (a < b) || c > 0 = " << (!(a<b) || c>0) << " (NOT antes do OR)" << std::endl;
    return 0;
}