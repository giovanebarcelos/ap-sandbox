class Retangulo:
    def __init__(self, largura=1.0, altura=1.0):
        self.largura = largura
        self.altura = altura

    def calcular_area(self):
        return self.largura * self.altura


r1 = Retangulo(5.0, 3.0)
r2 = Retangulo(4.0, 4.0)
r3 = Retangulo()

print(r1.calcular_area())
print(r2.calcular_area())
print(r3.calcular_area())
