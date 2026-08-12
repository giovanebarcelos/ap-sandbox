class Pessoa:
    def __init__(self):
        self.nome = ""
        self.idade = 0

    def cumprimentar(self):
        print(f"Ola, meu nome e {self.nome} e tenho {self.idade} anos")


p1 = Pessoa()
p1.nome = "Carla"
p1.idade = 28
p1.cumprimentar()

p2 = Pessoa()
p2.nome = "Diego"
p2.idade = 34
p2.cumprimentar()
