class Produto:
    def __init__(self, nome, preco, quantidade_estoque):
        self.nome = nome
        self.preco = preco
        self.quantidade_estoque = quantidade_estoque

    def valor_total_estoque(self):
        return self.preco * self.quantidade_estoque


p1 = Produto("Mouse", 45.0, 10)
p2 = Produto("Teclado", 120.0, 5)
print(p1.valor_total_estoque())
print(p2.valor_total_estoque())
