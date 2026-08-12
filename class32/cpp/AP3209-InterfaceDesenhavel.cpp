#include <iostream>
#include <vector>
using namespace std;

class Desenhavel {
    public:
        virtual void desenhar() = 0;
};

class Circulo : public Desenhavel {
    public:
        void desenhar() override {
            cout << "Desenhando um circulo (**)" << endl;
        }
};

class Quadrado : public Desenhavel {
    public:
        void desenhar() override {
            cout << "Desenhando um quadrado ([])" << endl;
        }
};

class Triangulo : public Desenhavel {
    public:
        void desenhar() override {
            cout << "Desenhando um triangulo (^^)" << endl;
        }
};

int main() {
    vector<Desenhavel*> formas = { new Circulo(), new Quadrado(), new Triangulo() };
    for (Desenhavel* f : formas) {
        f->desenhar();
    }
    return 0;
}
