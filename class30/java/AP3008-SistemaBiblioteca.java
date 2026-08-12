class Autor {
    String nome;
    String nacionalidade;
    Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
}

class Livro {
    String titulo;
    Autor autor;
    boolean disponivel;

    Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
}

class Usuario {
    String nome;
    String matricula;
    Usuario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
}

class Emprestimo {
    Livro livro;
    Usuario usuario;
    String dataEmprestimo;

    Emprestimo(Livro livro, Usuario usuario, String data) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = data;
        livro.disponivel = false;
    }

    void devolver() {
        livro.disponivel = true;
    }
}

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "Brasileira");
        Livro livro = new Livro("Dom Casmurro", autor);
        Usuario usuario = new Usuario("Beto", "2026001");

        Emprestimo emprestimo = new Emprestimo(livro, usuario, "2026-08-11");
        System.out.println(livro.titulo + " disponivel? " + livro.disponivel);

        emprestimo.devolver();
        System.out.println(livro.titulo + " disponivel apos devolucao? " + livro.disponivel);
    }
}
