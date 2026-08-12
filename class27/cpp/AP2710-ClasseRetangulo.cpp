#include <iostream>
using namespace std;

class Retangulo {
    public:
        double largura = 0.0;
        double altura = 0.0;

        double calcularArea() {
            return largura * altura;
        }

        double calcularPerimetro() {
            return 2 * (largura + altura);
        }
};

int main() {
    Retangulo r1;
    r1.largura = 5.0;
    r1.altura = 3.0;
    cout << "Area: " << r1.calcularArea() << endl;
    cout << "Perimetro: " << r1.calcularPerimetro() << endl;
    return 0;
}
