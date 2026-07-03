#include <iostream>
#include <algorithm>

void menu() {
    std::cout << "=== MENU PRINCIPAL ===\n";
    std::cout << "1 - Conversor Celsius -> Fahrenheit\n";
    std::cout << "2 - Calculadora de IMC\n";
    std::cout << "3 - Par ou Impar\n";
    std::cout << "4 - Maior de 3 numeros\n";
    std::cout << "5 - Sair\n";
}

int main() {
    int opcao = 0;
    while (opcao != 5) {
        menu();
        std::cout << "Escolha uma opcao: ";
        std::cin >> opcao;
        if (opcao == 1) {
            double c;
            std::cout << "Temperatura em Celsius: ";
            std::cin >> c;
            std::cout << c << "C = " << (c * 9 / 5 + 32) << "F\n";
        } else if (opcao == 2) {
            double peso, altura;
            std::cout << "Peso (kg): "; std::cin >> peso;
            std::cout << "Altura (m): "; std::cin >> altura;
            std::cout << "IMC: " << (peso / (altura * altura)) << "\n";
        } else if (opcao == 3) {
            int n;
            std::cout << "Numero: "; std::cin >> n;
            std::cout << (n % 2 == 0 ? "PAR" : "IMPAR") << "\n";
        } else if (opcao == 4) {
            double a, b, c;
            std::cout << "a: "; std::cin >> a;
            std::cout << "b: "; std::cin >> b;
            std::cout << "c: "; std::cin >> c;
            std::cout << "Maior: " << std::max(a, std::max(b, c)) << "\n";
        } else if (opcao == 5) {
            std::cout << "Saindo...\n";
        } else {
            std::cout << "Opcao invalida! Tente novamente.\n";
        }
    }
    return 0;
}
