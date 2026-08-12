from abc import ABC, abstractmethod


class Desenhavel(ABC):
    @abstractmethod
    def desenhar(self):
        pass


class Circulo(Desenhavel):
    def desenhar(self):
        print("Desenhando um circulo (**)")


class Quadrado(Desenhavel):
    def desenhar(self):
        print("Desenhando um quadrado ([])")


class Triangulo(Desenhavel):
    def desenhar(self):
        print("Desenhando um triangulo (^^)")


formas = [Circulo(), Quadrado(), Triangulo()]
for f in formas:
    f.desenhar()
