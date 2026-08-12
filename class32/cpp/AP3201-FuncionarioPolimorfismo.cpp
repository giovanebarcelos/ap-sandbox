#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Funcionario {
    public:
        string nome;
        double salario;

        Funcionario(string nome, double salario) {
            this->nome = nome;
            this->salario = salario;
        }

        virtual double calcularBonificacao() {
            return salario * 0.05;
        }
};

class Gerente : public Funcionario {
    public:
        Gerente(string nome, double salario) : Funcionario(nome, salario) {}

        double calcularBonificacao() override {
            return salario * 0.20;
        }
};

class Vendedor : public Funcionario {
    public:
        Vendedor(string nome, double salario) : Funcionario(nome, salario) {}

        double calcularBonificacao() override {
            return salario * 0.10;
        }
};

int main() {
    vector<Funcionario*> equipe = {
        new Gerente("Ana", 8000.0),
        new Vendedor("Beto", 3000.0),
        new Funcionario("Caio", 2000.0)
    };

    for (Funcionario* f : equipe) {
        cout << f->nome << ": " << f->calcularBonificacao() << endl;
    }
    return 0;
}
