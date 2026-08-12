#include <iostream>
using namespace std;

class Retangulo {
    public:
        double largura, altura;

        Retangulo() { largura = 1.0; altura = 1.0; }
        Retangulo(double lado) { largura = lado; altura = lado; }
        Retangulo(double l, double a) { largura = l; altura = a; }

        double calcularArea() {
            return largura * altura;
        }
};

int main() {
    Retangulo r1(5.0, 3.0);
    Retangulo r2(4.0);
    Retangulo r3;

    cout << r1.calcularArea() << endl;
    cout << r2.calcularArea() << endl;
    cout << r3.calcularArea() << endl;
    return 0;
}
