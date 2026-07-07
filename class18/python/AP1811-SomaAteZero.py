# SomaAteZero — Aula 18
# Soma números até o usuário digitar zero (loop enquanto com flag)

soma = 0
while True:
    n = float(input("Digite um número (0 para sair): "))
    if n == 0:
        break
    soma += n
print(f"Soma total: {soma:.2f}")
