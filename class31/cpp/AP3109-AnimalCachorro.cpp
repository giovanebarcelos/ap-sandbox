#include <iostream>
#include <string>
using namespace std;

class Animal {
    public:
        string nome;
        int idade;
        Animal(string nome, int idade) {
            this->nome = nome;
            this->idade = idade;
        }
};

class Cachorro : public Animal {
    public:
        string raca;
        Cachorro(string nome, int idade, string raca) : Animal(nome, idade) {
            this->raca = raca;
        }
};

int main() {
    Cachorro c1("Rex", 3, "Labrador");
    cout << c1.nome << ", " << c1.idade << " anos, raca " << c1.raca << endl;
    return 0;
}
