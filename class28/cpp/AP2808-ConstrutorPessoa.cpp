#include <iostream>
#include <string>
using namespace std;

class Pessoa {
    public:
        string nome;
        int idade;

        Pessoa(string nome, int idade) {
            this->nome = nome;
            this->idade = idade;
        }

        void cumprimentar() {
            cout << "Ola, meu nome e " << nome << " e tenho " << idade << " anos" << endl;
        }
};

int main() {
    Pessoa p1("Carla", 28);
    Pessoa p2("Diego", 34);
    p1.cumprimentar();
    p2.cumprimentar();
    return 0;
}
