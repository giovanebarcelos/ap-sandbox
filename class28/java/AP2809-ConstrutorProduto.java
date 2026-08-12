class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;

    Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    double valorTotalEstoque() {
        return preco * quantidadeEstoque;
    }
}

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Mouse", 45.0, 10);
        Produto p2 = new Produto("Teclado", 120.0, 5);
        System.out.println(p1.valorTotalEstoque());
        System.out.println(p2.valorTotalEstoque());
    }
}
