# TabelaVerdadeAND — Aula 04
# Demonstra a tabela verdade do operador AND

print("A | B | A AND B")
print("--+---+-------")
for a in [True, False]:
    for b in [True, False]:
        print(f"{a:5} | {b:5} | {a and b}")
