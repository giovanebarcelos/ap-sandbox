class Animal:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade


class Cachorro(Animal):
    def __init__(self, nome, idade, raca):
        super().__init__(nome, idade)
        self.raca = raca


c1 = Cachorro("Rex", 3, "Labrador")
print(f"{c1.nome}, {c1.idade} anos, raca {c1.raca}")
