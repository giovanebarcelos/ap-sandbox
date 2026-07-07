# QuadradoAsteriscosExtra — Aula 20
# Desenha um quadrado de asteriscos N×N

n = int(input("Tamanho do quadrado: "))
for i in range(n):
    for j in range(n):
        print("* ", end="")
    print()
