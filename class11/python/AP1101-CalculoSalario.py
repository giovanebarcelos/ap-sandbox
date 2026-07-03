# Calculo de salario liquido (estrutura sequencial)
bruto = float(input("Salario bruto: "))
inss = bruto * 0.11
ir = bruto * 0.075
liquido = bruto - inss - ir
print(f"INSS (11%): {inss:.2f}")
print(f"IR (7,5%): {ir:.2f}")
print(f"Salario liquido: {liquido:.2f}")
