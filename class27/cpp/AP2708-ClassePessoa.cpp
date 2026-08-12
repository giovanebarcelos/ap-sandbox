#include <iostream>
#include <string>
using namespace std;

class Pessoa {
    public:
        string nome;
        int idade = 0;

        void cumprimentar() {
            cout << "Ola, meu nome e " << nome << " e tenho " << idade << " anos" << endl;
        }
};

int main() {
    Pessoa p1;
    p1.nome = "Carla";
    p1.idade = 28;
    p1.cumprimentar();

    Pessoa p2;
    p2.nome = "Diego";
    p2.idade = 34;
    p2.cumprimentar();
    return 0;
}
