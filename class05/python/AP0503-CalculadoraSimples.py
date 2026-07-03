# Calculadora simples com 4 operacoes
a = float(input("Primeiro numero: "))
op = input("Operacao (+ - * /): ")
b = float(input("Segundo numero: "))
if op == "+":
    print(f"Resultado: {a + b}")
elif op == "-":
    print(f"Resultado: {a - b}")
elif op == "*":
    print(f"Resultado: {a * b}")
elif op == "/":
    if b != 0:
        print(f"Resultado: {a / b}")
    else:
        print("Erro: divisao por zero")
else:
    print("Operacao invalida")
