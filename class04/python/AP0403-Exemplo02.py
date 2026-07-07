# DesafioLogicoPortas — Aula 04
# Desafio: Determine a saída do circuito XOR usando AND/OR/NOT

print("Circuito XOR usando portas básicas:")
print("XOR = (A OR B) AND NOT (A AND B)")
a = input("A (true/false): ").lower() == "true"
b = input("B (true/false): ").lower() == "true"
xor = (a or b) and not (a and b)
print(f"A XOR B = {xor}")
