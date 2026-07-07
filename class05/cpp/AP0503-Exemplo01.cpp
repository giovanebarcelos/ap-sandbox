#include <iostream>
#include <iomanip>
int main() {
    double m;
    std::cout << "Digite o valor em metros: "; std::cin >> m;
    std::cout << std::fixed << std::setprecision(1);
    std::cout << m << " m = " << m*100 << " cm = " << m*1000 << " mm" << std::endl;
    return 0;
}