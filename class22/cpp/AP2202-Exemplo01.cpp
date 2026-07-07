#include <iostream>
#include <string>
void linha(std::string c, int t) {
    for (int i = 0; i < t; i++) std::cout << c;
    std::cout << std::endl;
}
int main() {
    linha("=", 30);
    std::cout << "  SISTEMA DE NOTAS  " << std::endl;
    linha("-", 30);
    std::cout << "  Aluno: João Silva  " << std::endl;
    std::cout << "  Nota: 8.5  " << std::endl;
    linha("=", 30);
    return 0;
}