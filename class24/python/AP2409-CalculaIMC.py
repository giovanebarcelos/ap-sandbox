def imc(peso, altura):
    return peso / (altura * altura)

v = imc(70, 1.75)
print(f"IMC: {v:.1f}")
