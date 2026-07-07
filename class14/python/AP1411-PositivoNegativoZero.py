# PositivoNegativoZero — Aula 14
# Classifica um número como positivo, negativo ou zero

num = float(input("Digite um número: "))
if num > 0:
    print(f"{num} é POSITIVO")
elif num < 0:
    print(f"{num} é NEGATIVO")
else:
    print("O número é ZERO")
