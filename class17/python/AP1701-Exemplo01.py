# MenuCalculadora — Aula 17
# Sistema de menu com 4 operações usando escolha

print("=== CALCULADORA ===")
print("1 - Somar")
print("2 - Subtrair")
print("3 - Multiplicar")
print("4 - Dividir")
op = int(input("Escolha: "))
a = float(input("Número 1: "))
b = float(input("Número 2: "))
if op == 1: print(f"{a} + {b} = {a+b}")
elif op == 2: print(f"{a} - {b} = {a-b}")
elif op == 3: print(f"{a} × {b} = {a*b}")
elif op == 4:
    if b != 0: print(f"{a} ÷ {b} = {a/b:.2f}")
    else: print("Erro: divisão por zero!")
else: print("Opção inválida!")
