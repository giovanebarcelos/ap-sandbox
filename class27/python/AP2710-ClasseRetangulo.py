class Retangulo:
    def __init__(self):
        self.largura = 0.0
        self.altura = 0.0

    def calcular_area(self):
        return self.largura * self.altura

    def calcular_perimetro(self):
        return 2 * (self.largura + self.altura)


r1 = Retangulo()
r1.largura = 5.0
r1.altura = 3.0
print(f"Area: {r1.calcular_area()}")
print(f"Perimetro: {r1.calcular_perimetro()}")
