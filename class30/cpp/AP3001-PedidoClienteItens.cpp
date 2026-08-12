#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Cliente {
    public:
        string nome;
        Cliente(string nome) { this->nome = nome; }
};

class ItemPedido {
    public:
        string produto;
        int quantidade;
        double precoUnitario;

        ItemPedido(string produto, int quantidade, double precoUnitario) {
            this->produto = produto;
            this->quantidade = quantidade;
            this->precoUnitario = precoUnitario;
        }

        double calcularSubtotal() {
            return quantidade * precoUnitario;
        }
};

class Pedido {
    public:
        Cliente cliente;
        vector<ItemPedido> itens;

        Pedido(Cliente cliente, vector<ItemPedido> itens) : cliente(cliente), itens(itens) {}

        double calcularTotal() {
            double total = 0;
            for (ItemPedido item : itens) {
                total = total + item.calcularSubtotal();
            }
            return total;
        }
};

int main() {
    Cliente cliente("Ana");
    vector<ItemPedido> itens = { ItemPedido("Mouse", 2, 45.0), ItemPedido("Teclado", 1, 120.0) };
    Pedido pedido(cliente, itens);

    cout << "Cliente: " << pedido.cliente.nome << endl;
    cout << "Total: " << pedido.calcularTotal() << endl;
    return 0;
}
