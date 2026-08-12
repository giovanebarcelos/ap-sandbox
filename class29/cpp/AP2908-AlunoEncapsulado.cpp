#include <iostream>
#include <string>
using namespace std;

class Aluno {
    private:
        string nome;
        double media = 0.0;

    public:
        Aluno(string nome) {
            this->nome = nome;
        }

        string getNome() {
            return nome;
        }

        double getMedia() {
            return media;
        }

        bool setMedia(double media) {
            if (media < 0 || media > 10) return false;
            this->media = media;
            return true;
        }

        bool estaAprovado() {
            return media >= 7.0;
        }
};

int main() {
    Aluno a1("Fernanda");
    a1.setMedia(8.5);
    cout << a1.getNome() << ": " << a1.getMedia() << " aprovado? " << (a1.estaAprovado() ? "sim" : "nao") << endl;

    bool ok = a1.setMedia(15.0);
    cout << "Media invalida aceita? " << (ok ? "sim" : "nao") << endl;
    return 0;
}
