# ValidaTriangulo — Aula 16
# Verifica se três lados formam um triângulo (AND com 3 condições)

a = float(input("Lado A: "))
b = float(input("Lado B: "))
c = float(input("Lado C: "))
if a + b > c and a + c > b and b + c > a:
    print("É um triângulo!")
    if a == b == c:
        print("Tipo: Equilátero")
    elif a == b or a == c or b == c:
        print("Tipo: Isósceles")
    else:
        print("Tipo: Escaleno")
else:
    print("Não forma um triângulo.")
