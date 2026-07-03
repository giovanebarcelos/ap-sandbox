a, b, c = 3, 3, 5
if a == b == c:
    print("Equilatero")
elif a == b or b == c or a == c:
    print("Isosceles")
else:
    print("Escaleno")
