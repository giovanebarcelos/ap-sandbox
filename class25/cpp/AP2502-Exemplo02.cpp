#include <iostream>
#include <iomanip>
#include <cmath>
int main() {
    double valor, taxa; int meses;
    std::cout << "Valor do empréstimo: R$ "; std::cin >> valor;
    std::cout << "Taxa mensal (%): "; std::cin >> taxa; taxa /= 100;
    std::cout << "Número de parcelas: "; std::cin >> meses;
    double parcela = valor * taxa * pow(1+taxa, meses) / (pow(1+taxa, meses)-1);
    double total = parcela * meses;
    std::cout << std::fixed << std::setprecision(2);
    std::cout << "\nParcela mensal: R$ " << parcela << std::endl;
    std::cout << "Total a pagar: R$ " << total << std::endl;
    std::cout << "Juros totais:  R$ " << total-valor << std::endl;
    return 0;
}