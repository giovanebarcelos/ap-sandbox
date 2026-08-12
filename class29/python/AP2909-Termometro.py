class Termometro:
    def __init__(self, temperatura_celsius):
        self._temperatura_celsius = temperatura_celsius

    @property
    def temperatura_celsius(self):
        return self._temperatura_celsius

    @property
    def temperatura_fahrenheit(self):
        return self._temperatura_celsius * 9 / 5 + 32


t1 = Termometro(25.0)
print(f"{t1.temperatura_celsius} C = {t1.temperatura_fahrenheit} F")
