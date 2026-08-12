class Livro {
    String titulo;
    String autor;
    int numeroPaginas;

    void exibirFicha() {
        System.out.println(titulo + " - " + autor + " (" + numeroPaginas + " paginas)");
    }
}

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.titulo = "Algoritmos e Programacao";
        l1.autor = "Giovane Barcelos";
        l1.numeroPaginas = 320;
        l1.exibirFicha();

        Livro l2 = new Livro();
        l2.titulo = "Clean Code";
        l2.autor = "Robert C. Martin";
        l2.numeroPaginas = 464;
        l2.exibirFicha();
    }
}
