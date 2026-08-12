class Cliente:
    def __init__(self, nome):
        self.nome = nome


class ItemPedido:
    def __init__(self, produto, quantidade, preco_unitario):
        self.produto = produto
        self.quantidade = quantidade
        self.preco_unitario = preco_unitario

    def calcular_subtotal(self):
        return self.quantidade * self.preco_unitario


class Pedido:
    def __init__(self, cliente, itens):
        self.cliente = cliente
        self.itens = itens

    def calcular_total(self):
        total = 0
        for item in self.itens:
            total = total + item.calcular_subtotal()
        return total


cliente = Cliente("Ana")
itens = [ItemPedido("Mouse", 2, 45.0), ItemPedido("Teclado", 1, 120.0)]
pedido = Pedido(cliente, itens)

print(f"Cliente: {pedido.cliente.nome}")
print(f"Total: {pedido.calcular_total()}")
