# DiagonalMatriz — Aula 10
# Extrai e exibe a diagonal principal de uma matriz 3x3

matriz = [[5, 2, 8], [3, 7, 1], [9, 4, 6]]
print("Matriz 3x3:")
for linha in matriz:
    print("  ".join(str(x) for x in linha))
print("\nDiagonal principal:")
for i in range(3):
    print(f"  m[{i}][{i}] = {matriz[i][i]}")
