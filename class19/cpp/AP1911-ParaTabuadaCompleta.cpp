#include <iostream>
#include <iomanip>
int main() {
    for (int i = 1; i <= 10; i++) {
        std::cout << "Tabuada do " << i << ":" << std::endl;
        for (int j = 1; j <= 10; j++)
            std::cout << "  " << std::setw(2) << i << " × " << std::setw(2) << j << " = " << std::setw(3) << i*j << std::endl;
        std::cout << std::endl;
    }
    return 0;
}