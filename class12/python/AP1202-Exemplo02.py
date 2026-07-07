# OperadoresAtribuicao — Aula 12
# Demonstra operadores de atribuição composta (+=, -=, *=, /=, %=)

x = 10
print(f"Valor inicial: x = {x}")
x += 5; print(f"x += 5  → x = {x}")
x -= 3; print(f"x -= 3  → x = {x}")
x *= 2; print(f"x *= 2  → x = {x}")
x /= 4; print(f"x /= 4  → x = {x:.1f}")
x = int(x); x %= 3; print(f"x %= 3  → x = {x}")
