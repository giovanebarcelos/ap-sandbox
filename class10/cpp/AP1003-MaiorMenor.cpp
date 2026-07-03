#include <iostream>
int main() {
    int numeros[10] = {4, 15, 8, 23, 16, 42, 7, 11, 9, 30};
    int maior = numeros[0], menor = numeros[0];
    for (int i = 1; i < 10; i++) {
        if (numeros[i] > maior) maior = numeros[i];
        if (numeros[i] < menor) menor = numeros[i];
    }
    std::cout << "Maior: " << maior << std::endl;
    std::cout << "Menor: " << menor << std::endl;
    return 0;
}
