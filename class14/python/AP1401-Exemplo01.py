# MaiorDeTres — Aula 14
# Encontra o maior entre três números usando SE/SENAO

a = float(input("Número 1: "))
b = float(input("Número 2: "))
c = float(input("Número 3: "))
if a >= b and a >= c:
    maior = a
elif b >= c:
    maior = b
else:
    maior = c
print(f"O maior número é {maior}")
