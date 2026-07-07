# ParaTabuadaCompleta — Aula 19
# Tabuada de 1 a 10 usando dois laços PARA

for i in range(1, 11):
    print(f"Tabuada do {i}:")
    for j in range(1, 11):
        print(f"  {i:2} × {j:2} = {i*j:3}")
    print()
