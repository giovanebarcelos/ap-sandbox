#include <iostream>
int main() {
    int op; double a, b;
    do {
        std::cout << "1-Somar 2-Sub 3-Mult 4-Div 5-Sair\nOpcao: ";
        std::cin >> op;
        if (op >= 1 && op <= 4) {
            std::cout << "N1: "; std::cin >> a;
            std::cout << "N2: "; std::cin >> b;
        }
        switch (op) {
            case 1: std::cout << a+b << std::endl; break;
            case 2: std::cout << a-b << std::endl; break;
            case 3: std::cout << a*b << std::endl; break;
            case 4: if(b!=0) std::cout << a/b << std::endl; break;
        }
    } while (op != 5);
    return 0;
}
