#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Pagavel {
    public:
        virtual double calcularValorPagamento() = 0;
};

class Funcionario : public Pagavel {
    public:
        string nome;
        double salario;

        Funcionario(string nome, double salario) {
            this->nome = nome;
            this->salario = salario;
        }

        double calcularValorPagamento() override {
            return salario;
        }
};

class Fornecedor : public Pagavel {
    public:
        string razaoSocial;
        double valorContrato;

        Fornecedor(string razaoSocial, double valorContrato) {
            this->razaoSocial = razaoSocial;
            this->valorContrato = valorContrato;
        }

        double calcularValorPagamento() override {
            return valorContrato * 0.9;
        }
};

double totalAPagar(vector<Pagavel*> itens) {
    double total = 0;
    for (Pagavel* p : itens) {
        total = total + p->calcularValorPagamento();
    }
    return total;
}

int main() {
    vector<Pagavel*> itens = {
        new Funcionario("Ana", 5000.0),
        new Fornecedor("Papelaria XYZ", 2000.0)
    };
    cout << "Total a pagar: " << totalAPagar(itens) << endl;
    return 0;
}
