class Circulo:
    def __init__(self, raio=1.0):
        self.raio = raio

    def calcular_area(self):
        return 3.14159 * self.raio * self.raio


c1 = Circulo(2.0)
c2 = Circulo()
print(c1.calcular_area())
print(c2.calcular_area())
