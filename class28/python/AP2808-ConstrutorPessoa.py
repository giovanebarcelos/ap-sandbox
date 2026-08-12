class Pessoa:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def cumprimentar(self):
        print(f"Ola, meu nome e {self.nome} e tenho {self.idade} anos")


p1 = Pessoa("Carla", 28)
p2 = Pessoa("Diego", 34)
p1.cumprimentar()
p2.cumprimentar()
