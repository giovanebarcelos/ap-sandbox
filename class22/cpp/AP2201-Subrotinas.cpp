#include <iostream>
void exibirMenu() {
    std::cout << "1 - Sacar\n2 - Depositar\n3 - Sair" << std::endl;
}
int dobro(int n) { return n * 2; }
int main() {
    exibirMenu();
    std::cout << "Dobro de 5 = " << dobro(5) << std::endl;
    return 0;
}
