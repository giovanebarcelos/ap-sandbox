#include <iostream>
#include <string>
int main() {
    std::string sa, sb;
    std::cout << "Circuito XOR usando portas básicas:" << std::endl;
    std::cout << "XOR = (A OR B) AND NOT (A AND B)" << std::endl;
    std::cout << "A (true/false): "; std::cin >> sa;
    std::cout << "B (true/false): "; std::cin >> sb;
    bool a = (sa == "true"), b = (sb == "true");
    bool xr = (a || b) && !(a && b);
    std::cout << "A XOR B = " << std::boolalpha << xr << std::endl;
    return 0;
}