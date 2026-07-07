# DepuracaoDivisao — Aula 07
# Programa com bug proposital: divisão por zero

a = float(input("Numerador: "))
b = float(input("Denominador: "))
# BUG CORRIGIDO: verificação antes da divisão
if b == 0:
    print("Erro: divisão por zero!")
else:
    print(f"Resultado: {a / b:.2f}")
