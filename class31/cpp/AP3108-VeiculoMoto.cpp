#include <iostream>
#include <string>
using namespace std;

class Veiculo {
    public:
        string marca;
        double velocidadeMaxima;
        Veiculo(string marca, double velocidadeMaxima) {
            this->marca = marca;
            this->velocidadeMaxima = velocidadeMaxima;
        }
};

class Moto : public Veiculo {
    public:
        int cilindradas;
        Moto(string marca, double velocidadeMaxima, int cilindradas)
            : Veiculo(marca, velocidadeMaxima) {
            this->cilindradas = cilindradas;
        }
};

int main() {
    Moto m1("Honda", 180.0, 160);
    cout << m1.marca << " - " << m1.velocidadeMaxima << " km/h - " << m1.cilindradas << " cc" << endl;
    return 0;
}
