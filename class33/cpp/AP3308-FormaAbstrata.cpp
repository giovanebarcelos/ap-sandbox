#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Forma {
    public:
        string nome;
        Forma(string nome) { this->nome = nome; }
        virtual double calcularArea() = 0;
        void exibirResumo() {
            cout << nome << ": area = " << calcularArea() << endl;
        }
};

class Circulo : public Forma {
    public:
        double raio;
        Circulo(double raio) : Forma("Circulo") { this->raio = raio; }
        double calcularArea() override {
            return 3.14159 * raio * raio;
        }
};

class Quadrado : public Forma {
    public:
        double lado;
        Quadrado(double lado) : Forma("Quadrado") { this->lado = lado; }
        double calcularArea() override {
            return lado * lado;
        }
};

int main() {
    vector<Forma*> formas = { new Circulo(3.0), new Quadrado(4.0) };
    for (Forma* f : formas) {
        f->exibirResumo();
    }
    return 0;
}
