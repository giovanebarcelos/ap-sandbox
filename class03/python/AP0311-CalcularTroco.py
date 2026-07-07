# CalcularTroco — Aula 03
# Algoritmo de saque com cálculo de troco

valor = float(input("Valor da compra: R$ "))
pago = float(input("Valor pago: R$ "))
troco = pago - valor
if troco < 0:
    print("Dinheiro insuficiente!")
else:
    print(f"Troco: R$ {troco:.2f}")
