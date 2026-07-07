#include <iostream>
#include <string>
bool validarEmail(std::string email) {
    size_t arroba = email.find(64);
    if (arroba == std::string::npos) return false;
    return email.find(46, arroba) != std::string::npos;
}
int main() {
    std::string email;
    std::cout << "Digite seu email: "; std::getline(std::cin, email);
    if (validarEmail(email)) std::cout << "Email " << email << " eh VALIDO!" << std::endl;
    else std::cout << "Email " << email << " eh INVALIDO!" << std::endl;
    return 0;
}