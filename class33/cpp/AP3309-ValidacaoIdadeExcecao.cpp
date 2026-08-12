#include <iostream>
#include <stdexcept>
using namespace std;

void validarIdade(int idade) {
    if (idade < 0 || idade > 130) {
        throw invalid_argument("idade fora da faixa aceita: " + to_string(idade));
    }
}

int main() {
    try {
        validarIdade(-5);
    } catch (const invalid_argument& e) {
        cout << "Erro: " << e.what() << endl;
    }

    try {
        validarIdade(25);
        cout << "Idade 25 valida" << endl;
    } catch (const invalid_argument& e) {
        cout << "Erro: " << e.what() << endl;
    }
    return 0;
}
