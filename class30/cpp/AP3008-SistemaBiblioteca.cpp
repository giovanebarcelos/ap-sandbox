#include <iostream>
#include <string>
using namespace std;

class Autor {
    public:
        string nome, nacionalidade;
        Autor(string nome, string nacionalidade) {
            this->nome = nome;
            this->nacionalidade = nacionalidade;
        }
};

class Livro {
    public:
        string titulo;
        Autor autor;
        bool disponivel;

        Livro(string titulo, Autor autor) : autor(autor) {
            this->titulo = titulo;
            this->disponivel = true;
        }
};

class Usuario {
    public:
        string nome, matricula;
        Usuario(string nome, string matricula) {
            this->nome = nome;
            this->matricula = matricula;
        }
};

class Emprestimo {
    public:
        // & = referencia: um "apelido" para o Livro passado, nao uma copia.
        // Sem isso, Emprestimo receberia sua PROPRIA copia de Livro, e marcar
        // disponivel=false aqui nao mudaria o livro original em main().
        Livro& livro;
        Usuario usuario;
        string dataEmprestimo;

        Emprestimo(Livro& livro, Usuario usuario, string data) : livro(livro), usuario(usuario) {
            this->dataEmprestimo = data;
            livro.disponivel = false;
        }

        void devolver() {
            livro.disponivel = true;
        }
};

int main() {
    Autor autor("Machado de Assis", "Brasileira");
    Livro livro("Dom Casmurro", autor);
    Usuario usuario("Beto", "2026001");

    Emprestimo emprestimo(livro, usuario, "2026-08-11");
    cout << livro.titulo << " disponivel? " << (livro.disponivel ? "sim" : "nao") << endl;

    emprestimo.devolver();
    cout << livro.titulo << " disponivel apos devolucao? " << (livro.disponivel ? "sim" : "nao") << endl;
    return 0;
}
