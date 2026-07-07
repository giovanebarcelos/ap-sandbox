# TrianguloFloyd — Aula 20
# Triângulo de Floyd (números naturais em triângulo)

n = int(input("Número de linhas: "))
num = 1
for i in range(1, n + 1):
    for j in range(i):
        print(f"{num:3}", end="")
        num += 1
    print()
