class Funcionario:
    def __init__(self, nome, salario):
        self.nome = nome
        self.salario = salario

    def descricao(self):
        return f"{self.nome} - R$ {self.salario}"


class Gerente(Funcionario):
    def __init__(self, nome, salario, bonus):
        super().__init__(nome, salario)
        self.bonus = bonus

    def descricao(self):
        return f"{super().descricao()} (bonus: R$ {self.bonus})"


g1 = Gerente("Ana", 8000.0, 1500.0)
print(g1.descricao())
