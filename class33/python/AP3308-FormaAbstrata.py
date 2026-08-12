from abc import ABC, abstractmethod


class Forma(ABC):
    def __init__(self, nome):
        self.nome = nome

    @abstractmethod
    def calcular_area(self):
        pass

    def exibir_resumo(self):
        print(f"{self.nome}: area = {self.calcular_area()}")


class Circulo(Forma):
    def __init__(self, raio):
        super().__init__("Circulo")
        self.raio = raio

    def calcular_area(self):
        return 3.14159 * self.raio * self.raio


class Quadrado(Forma):
    def __init__(self, lado):
        super().__init__("Quadrado")
        self.lado = lado

    def calcular_area(self):
        return self.lado * self.lado


formas = [Circulo(3.0), Quadrado(4.0)]
for f in formas:
    f.exibir_resumo()
