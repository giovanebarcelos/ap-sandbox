# BuscaNoVetor — Aula 10
# Busca um valor em um vetor e retorna o índice

numeros = [10, 25, 33, 47, 52, 68, 71]
buscado = int(input("Digite o número a buscar: "))
encontrado = False
for i in range(len(numeros)):
    if numeros[i] == buscado:
        print(f"Encontrado na posição {i}!")
        encontrado = True
        break
if not encontrado:
    print("Número não encontrado no vetor.")
