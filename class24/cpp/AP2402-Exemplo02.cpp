#include <iostream>
#include <iomanip>
double mediaPonderada(double notas[], int pesos[], int tam) {
    double somaN = 0; int somaP = 0;
    for (int i = 0; i < tam; i++) {
        somaN += notas[i] * pesos[i];
        somaP += pesos[i];
    }
    return somaP > 0 ? somaN/somaP : 0;
}
int main() {
    double notas[] = {8.5, 7.0, 9.0};
    int pesos[] = {2, 3, 5};
    std::cout << "Notas: 8.5 7.0 9.0" << std::endl;
    std::cout << "Pesos: 2 3 5" << std::endl;
    std::cout << "Média Ponderada: " << std::fixed << std::setprecision(2) << mediaPonderada(notas, pesos, 3) << std::endl;
    return 0;
}