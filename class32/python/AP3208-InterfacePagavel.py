from abc import ABC, abstractmethod


class Pagavel(ABC):
    @abstractmethod
    def calcular_valor_pagamento(self):
        pass


class Funcionario(Pagavel):
    def __init__(self, nome, salario):
        self.nome = nome
        self.salario = salario

    def calcular_valor_pagamento(self):
        return self.salario


class Fornecedor(Pagavel):
    def __init__(self, razao_social, valor_contrato):
        self.razao_social = razao_social
        self.valor_contrato = valor_contrato

    def calcular_valor_pagamento(self):
        return self.valor_contrato * 0.9


def total_a_pagar(itens):
    total = 0
    for p in itens:
        total = total + p.calcular_valor_pagamento()
    return total


itens = [Funcionario("Ana", 5000.0), Fornecedor("Papelaria XYZ", 2000.0)]
print(f"Total a pagar: {total_a_pagar(itens)}")
