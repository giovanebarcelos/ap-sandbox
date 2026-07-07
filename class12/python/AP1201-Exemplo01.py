# PrecedenciaOperadores — Aula 12
# Demonstra a precedência de operadores aritméticos, relacionais e lógicos

a, b, c = 10, 5, 2
print(f"a={a}, b={b}, c={c}")
print(f"a + b * c = {a + b * c}   (multiplicação antes da soma)")
print(f"(a + b) * c = {(a + b) * c} (parênteses alteram a ordem)")
print(f"a > b and b > c = {a > b and b > c} (relacionais antes do lógico)")
print(f"not a < b or c > 0 = {not a < b or c > 0} (NOT antes do OR)")
