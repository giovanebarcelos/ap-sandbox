class Veiculo:
    def __init__(self, marca, velocidade_maxima):
        self.marca = marca
        self.velocidade_maxima = velocidade_maxima


class Moto(Veiculo):
    def __init__(self, marca, velocidade_maxima, cilindradas):
        super().__init__(marca, velocidade_maxima)
        self.cilindradas = cilindradas


m1 = Moto("Honda", 180.0, 160)
print(f"{m1.marca} - {m1.velocidade_maxima} km/h - {m1.cilindradas} cc")
