class Aluno:
    def __init__(self):
        self.nome = ""
        self.media = 0.0

    def esta_aprovado(self):
        return self.media >= 7.0


a1 = Aluno()
a1.nome = "Fernanda"
a1.media = 8.5

a2 = Aluno()
a2.nome = "Gustavo"
a2.media = 5.2

print(f"{a1.nome} aprovado? {a1.esta_aprovado()}")
print(f"{a2.nome} aprovado? {a2.esta_aprovado()}")
