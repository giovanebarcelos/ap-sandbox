#include <iostream>
using namespace std;

class Circulo {
    public:
        double raio;

        Circulo() : Circulo(1.0) {}
        Circulo(double raio) { this->raio = raio; }

        double calcularArea() {
            return 3.14159 * raio * raio;
        }
};

int main() {
    Circulo c1(2.0);
    Circulo c2;
    cout << c1.calcularArea() << endl;
    cout << c2.calcularArea() << endl;
    return 0;
}
