# Matriz (variavel indexada bidimensional): declaracao e acesso m[i][j]
m = [[1, 2, 3],
     [4, 5, 6]]
print("m[0][2] =", m[0][2])   # 3
print("m[1][0] =", m[1][0])   # 4
print("Matriz completa:")
for i in range(len(m)):
    for j in range(len(m[i])):
        print(m[i][j], end=" ")
    print()
