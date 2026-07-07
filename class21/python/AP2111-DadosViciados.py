# DadosViciados — Aula 21
# Simulador de lançamento de dado com estatísticas

import random
lancamentos = int(input("Quantos lançamentos? "))
freq = [0] * 7
for _ in range(lancamentos):
    face = random.randint(1, 6)
    freq[face] += 1
print("\nResultados:")
for face in range(1, 7):
    pct = freq[face] / lancamentos * 100
    print(f"Face {face}: {freq[face]} vezes ({pct:.1f}%)")
