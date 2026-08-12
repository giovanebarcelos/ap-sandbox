#include <iostream>
#include <string>
using namespace std;

class Produto {
    public:
        string nome;
        double preco;
        int quantidadeEstoque;

        Produto(string nome, double preco, int quantidadeEstoque) {
            this->nome = nome;
            this->preco = preco;
            this->quantidadeEstoque = quantidadeEstoque;
        }

        double valorTotalEstoque() {
            return preco * quantidadeEstoque;
        }
};

int main() {
    Produto p1("Mouse", 45.0, 10);
    Produto p2("Teclado", 120.0, 5);
    cout << p1.valorTotalEstoque() << endl;
    cout << p2.valorTotalEstoque() << endl;
    return 0;
}
