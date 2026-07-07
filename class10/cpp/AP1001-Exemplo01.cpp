#include <iostream>
int main() {
    int numeros[] = {10, 25, 33, 47, 52, 68, 71};
    int tamanho = sizeof(numeros)/sizeof(numeros[0]);
    int buscado;
    std::cout << "Digite o número a buscar: "; std::cin >> buscado;
    bool encontrado = false;
    for (int i = 0; i < tamanho; i++) {
        if (numeros[i] == buscado) {
            std::cout << "Encontrado na posição " << i << "!" << std::endl;
            encontrado = true;
            break;
        }
    }
    if (!encontrado) std::cout << "Número não encontrado no vetor." << std::endl;
    return 0;
}