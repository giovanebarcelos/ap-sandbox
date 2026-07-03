# Soma de duas matrizes de mesmo tamanho
a = [[1, 2, 3], [4, 5, 6]]
b = [[10, 20, 30], [40, 50, 60]]
LIN, COL = 2, 3
c = [[0] * COL for _ in range(LIN)]
for i in range(LIN):
    for j in range(COL):
        c[i][j] = a[i][j] + b[i][j]
print("Matriz soma:")
for linha in c:
    print(linha)
