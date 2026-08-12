#include <iostream>
#include <string>
using namespace std;

class Aluno {
    public:
        string nome;
        double media = 0.0;

        bool estaAprovado() {
            return media >= 7.0;
        }
};

int main() {
    Aluno a1;
    a1.nome = "Fernanda";
    a1.media = 8.5;

    Aluno a2;
    a2.nome = "Gustavo";
    a2.media = 5.2;

    cout << a1.nome << " aprovado? " << (a1.estaAprovado() ? "sim" : "nao") << endl;
    cout << a2.nome << " aprovado? " << (a2.estaAprovado() ? "sim" : "nao") << endl;
    return 0;
}
