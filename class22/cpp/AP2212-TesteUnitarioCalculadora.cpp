// Teste unitário em C++ usando <cassert> (biblioteca padrão, sem instalar nada).
// Compilar e rodar:
//   g++ -std=c++17 AP2212-TesteUnitarioCalculadora.cpp -o teste_calculadora
//   ./teste_calculadora
#include <cassert>
#include <iostream>

int dobro(int n) { return n * 2; }

bool ehPar(int n) { return n % 2 == 0; }

long fatorial(int n) {
    if (n < 0) throw std::invalid_argument("fatorial não definido para negativos");
    long resultado = 1;
    for (int i = 2; i <= n; i++) resultado *= i;
    return resultado;
}

int main() {
    // Arrange-Act-Assert: cada teste prepara os dados, executa e confere o resultado
    assert(dobro(7) == 14);
    assert(dobro(0) == 0);

    assert(ehPar(4) == true);
    assert(ehPar(7) == false);

    assert(fatorial(5) == 120);
    assert(fatorial(0) == 1);

    bool lancouExcecao = false;
    try {
        fatorial(-1);
    } catch (const std::invalid_argument&) {
        lancouExcecao = true;
    }
    assert(lancouExcecao);

    std::cout << "Todos os testes passaram!" << std::endl;
    return 0;
}
