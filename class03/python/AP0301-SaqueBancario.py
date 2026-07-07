saldo = float(input("Saldo: R$ "))
saque = float(input("Saque: R$ "))
if saque > saldo:
    print("Saldo insuficiente")
elif saque % 10 != 0:
    print("Use múltiplos de R$10")
else:
    saldo -= saque
    print(f"Saque liberado! Saldo: R$ {saldo:.2f}")
