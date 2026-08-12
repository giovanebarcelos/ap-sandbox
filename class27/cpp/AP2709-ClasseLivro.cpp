#include <iostream>
#include <string>
using namespace std;

class Livro {
    public:
        string titulo;
        string autor;
        int numeroPaginas = 0;

        void exibirFicha() {
            cout << titulo << " - " << autor << " (" << numeroPaginas << " paginas)" << endl;
        }
};

int main() {
    Livro l1;
    l1.titulo = "Algoritmos e Programacao";
    l1.autor = "Giovane Barcelos";
    l1.numeroPaginas = 320;
    l1.exibirFicha();

    Livro l2;
    l2.titulo = "Clean Code";
    l2.autor = "Robert C. Martin";
    l2.numeroPaginas = 464;
    l2.exibirFicha();
    return 0;
}
