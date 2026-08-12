class Funcionario:
    def __init__(self, nome, salario):
        self.nome = nome
        self.salario = salario

    def calcular_bonificacao(self):
        return self.salario * 0.05


class Gerente(Funcionario):
    def calcular_bonificacao(self):
        return self.salario * 0.20


class Vendedor(Funcionario):
    def calcular_bonificacao(self):
        return self.salario * 0.10


equipe = [Gerente("Ana", 8000.0), Vendedor("Beto", 3000.0), Funcionario("Caio", 2000.0)]

for f in equipe:
    print(f"{f.nome}: {f.calcular_bonificacao()}")
