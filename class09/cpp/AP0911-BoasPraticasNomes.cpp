#include <iostream>
#include <iomanip>
int main() {
    double salarioBruto = 5000.00;
    double descontoInss = salarioBruto * 0.11;
    double descontoIr = salarioBruto * 0.075;
    double salarioLiquido = salarioBruto - descontoInss - descontoIr;
    std::cout << std::fixed << std::setprecision(2);
    std::cout << "Salário Bruto: R$ " << salarioBruto << std::endl;
    std::cout << "Desconto INSS: R$ " << descontoInss << std::endl;
    std::cout << "Desconto IR:   R$ " << descontoIr << std::endl;
    std::cout << "Salário Líquido: R$ " << salarioLiquido << std::endl;
    return 0;
}