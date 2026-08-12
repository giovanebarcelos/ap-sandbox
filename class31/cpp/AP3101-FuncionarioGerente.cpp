#include <iostream>
#include <string>
using namespace std;

class Funcionario {
    public:
        string nome;
        double salario;

        Funcionario(string nome, double salario) {
            this->nome = nome;
            this->salario = salario;
        }

        string descricao() {
            return nome + " - R$ " + to_string(salario);
        }
};

class Gerente : public Funcionario {
    public:
        double bonus;

        Gerente(string nome, double salario, double bonus)
            : Funcionario(nome, salario) {
            this->bonus = bonus;
        }

        string descricao() {
            return Funcionario::descricao() + " (bonus: R$ " + to_string(bonus) + ")";
        }
};

int main() {
    Gerente g1("Ana", 8000.0, 1500.0);
    cout << g1.descricao() << endl;
    return 0;
}
