#include <iostream>
#include <iomanip>
int main() {
    bool vals[] = {true, false};
    std::cout << "A     | B     | A AND B" << std::endl;
    std::cout << "------+-------+-------" << std::endl;
    for (bool a : vals)
        for (bool b : vals)
            std::cout << std::boolalpha << std::left << std::setw(5) << a << " | " << std::setw(5) << b << " | " << (a && b) << std::endl;
    return 0;
}