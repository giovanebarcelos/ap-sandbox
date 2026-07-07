#include <iostream>
#include <string>
int main() {
    std::string senhaCorreta = "1234", senha;
    do {
        std::cout << "Digite a senha: "; std::cin >> senha;
        if (senha != senhaCorreta)
            std::cout << "Senha incorreta. Tente novamente." << std::endl;
    } while (senha != senhaCorreta);
    std::cout << "Acesso permitido!" << std::endl;
    return 0;
}