# Tabuada 10x10 em matriz: m[i][j] = (i+1) * (j+1)
N = 10
m = [[(i + 1) * (j + 1) for j in range(N)] for i in range(N)]
for i in range(N):
    for j in range(N):
        print(f"{m[i][j]:4d}", end="")
    print()
