class Cliente {
    String nome;
    Cliente(String nome) {
        this.nome = nome;
    }
}

class ItemPedido {
    String produto;
    int quantidade;
    double precoUnitario;

    ItemPedido(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    double calcularSubtotal() {
        return quantidade * precoUnitario;
    }
}

class Pedido {
    Cliente cliente;
    ItemPedido[] itens;

    Pedido(Cliente cliente, ItemPedido[] itens) {
        this.cliente = cliente;
        this.itens = itens;
    }

    double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total = total + item.calcularSubtotal();
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana");
        ItemPedido[] itens = {
            new ItemPedido("Mouse", 2, 45.0),
            new ItemPedido("Teclado", 1, 120.0)
        };
        Pedido pedido = new Pedido(cliente, itens);

        System.out.println("Cliente: " + pedido.cliente.nome);
        System.out.println("Total: " + pedido.calcularTotal());
    }
}
