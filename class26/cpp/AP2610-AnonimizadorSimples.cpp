#include <iostream>
#include <string>
#include <sstream>
int main() {
    std::string nome, palavra, primeiro, ultimo;
    std::cout << "Nome completo: "; std::getline(std::cin, nome);
    std::istringstream iss(nome);
    iss >> primeiro;
    while (iss >> ultimo);
    std::string anon = primeiro[0] + std::string("*** ") + ultimo[0] + "***";
    std::cout << "Nome original: " << nome << std::endl;
    std::cout << "Nome anonimizado: " << anon << std::endl;
    std::cout << "Dados anonimizados protegem a privacidade (LGPD)." << std::endl;
    return 0;
}