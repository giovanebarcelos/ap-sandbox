#include <iostream>
#include <iomanip>
int main() {
    double horas, valorHora;
    std::cout << "Horas trabalhadas: "; std::cin >> horas;
    std::cout << "Valor por hora: R$ "; std::cin >> valorHora;
    double bruto = horas * valorHora;
    double inss = bruto * 0.08;
    double liquido = bruto - inss;
    std::cout << std::fixed << std::setprecision(2);
    std::cout << "Salário Bruto:   R$ " << bruto << std::endl;
    std::cout << "Desconto INSS:   R$ " << inss << std::endl;
    std::cout << "Salário Líquido: R$ " << liquido << std::endl;
    return 0;
}