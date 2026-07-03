#include <iostream>
#include <string>
int main() {
    std::string texto = "42";
    int numero = std::stoi(texto);          // string -> int
    std::cout << numero + 8 << std::endl;   // 50

    double real = std::stod("3.14");        // string -> double
    std::cout << real * 2 << std::endl;     // 6.28

    int inteiro = (int) 9.99;               // double -> int (trunca)
    std::cout << inteiro << std::endl;      // 9

    std::string comoTexto = std::to_string(2026);  // int -> string
    std::cout << "Ano: " << comoTexto << std::endl;
    return 0;
}
