# CalculadoraBasica — Aula 05
# Calculadora com as 4 operações básicas

a = float(input("Digite o primeiro número: "))
b = float(input("Digite o segundo número: "))
print(f"Soma: {a + b}")
print(f"Subtração: {a - b}")
print(f"Multiplicação: {a * b}")
if b != 0:
    print(f"Divisão: {a / b:.2f}")
else:
    print("Divisão: Não é possível dividir por zero")
