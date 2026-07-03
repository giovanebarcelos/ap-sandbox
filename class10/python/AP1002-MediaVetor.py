# Media dos elementos de um vetor
MAX = 5
notas = [0.0] * MAX
soma = 0.0
for i in range(MAX):
    notas[i] = float(input(f"Nota {i+1}: "))
    soma += notas[i]
print(f"Media: {soma / MAX:.1f}")
