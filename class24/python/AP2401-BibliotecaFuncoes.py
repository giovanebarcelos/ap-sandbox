# Biblioteca de funcoes de validacao e calculo
def eh_par(n):
    return n % 2 == 0


def imc(peso, altura):
    return peso / (altura * altura)


def classifica_imc(valor):
    if valor < 18.5:
        return "Abaixo do peso"
    elif valor < 25:
        return "Peso normal"
    elif valor < 30:
        return "Sobrepeso"
    return "Obesidade"


print("10 e par?", eh_par(10))          # True
valor = imc(70, 1.75)
print(f"IMC: {valor:.1f} - {classifica_imc(valor)}")
