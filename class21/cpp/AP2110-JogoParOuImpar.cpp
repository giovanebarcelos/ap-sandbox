#include <iostream>
#include <cstdlib>
#include <ctime>
int main() {
    srand(time(0));
    int jogador;
    std::cout << "=== PAR OU ÍMPAR ===" << std::endl;
    std::cout << "Escolha um número (0-10): "; std::cin >> jogador;
    int computador = rand() % 11;
    int soma = jogador + computador;
    std::cout << "Você: " << jogador << " | Computador: " << computador << " | Soma: " << soma << std::endl;
    if (soma % 2 == 0) std::cout << "Soma PAR — Venceu quem escolheu PAR!" << std::endl;
    else std::cout << "Soma ÍMPAR — Venceu quem escolheu ÍMPAR!" << std::endl;
    return 0;
}