import math
a, b, c = 1, -5, 6
delta = b*b - 4*a*c
if delta >= 0:
    x1 = (-b + math.sqrt(delta)) / (2*a)
    x2 = (-b - math.sqrt(delta)) / (2*a)
    print(f"Raizes: {x1} e {x2}")
else:
    print("Sem raizes reais")
