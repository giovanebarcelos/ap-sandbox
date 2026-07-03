# Conversao de tipos (casting)
texto = "42"
numero = int(texto)          # str -> int
print(numero + 8)            # 50

real = float("3.14")         # str -> float
print(real * 2)              # 6.28

inteiro = int(9.99)          # float -> int (trunca)
print(inteiro)               # 9

como_texto = str(2026)       # int -> str
print("Ano: " + como_texto)
