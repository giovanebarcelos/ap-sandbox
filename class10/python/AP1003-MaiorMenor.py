# Maior e menor de um vetor
numeros = [4, 15, 8, 23, 16, 42, 7, 11, 9, 30]
maior = menor = numeros[0]
for x in numeros[1:]:
    if x > maior:
        maior = x
    if x < menor:
        menor = x
print("Vetor:", numeros)
print("Maior:", maior)
print("Menor:", menor)
