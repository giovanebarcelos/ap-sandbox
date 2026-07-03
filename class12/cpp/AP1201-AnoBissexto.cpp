#include <iostream>
int main() {
    int ano;
    std::cout << "Digite o ano: ";
    std::cin >> ano;
    bool bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    std::cout << ano << (bissexto ? " E bissexto" : " NAO e bissexto") << std::endl;
    return 0;
}
