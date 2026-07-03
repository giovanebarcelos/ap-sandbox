# Validacao de triangulo e classificacao (operadores logicos)
a = float(input("Lado a: "))
b = float(input("Lado b: "))
c = float(input("Lado c: "))
if a < b + c and b < a + c and c < a + b:
    if a == b and b == c:
        print("Triangulo EQUILATERO")
    elif a == b or b == c or a == c:
        print("Triangulo ISOSCELES")
    else:
        print("Triangulo ESCALENO")
else:
    print("Nao formam um triangulo")
