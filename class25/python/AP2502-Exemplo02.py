# SimuladorEmprestimo — Aula 25
# Simulador de empréstimo com cálculo de parcelas

valor = float(input("Valor do empréstimo: R$ "))
taxa = float(input("Taxa mensal (%): "))
meses = int(input("Número de parcelas: "))
taxa_decimal = taxa / 100
parcela = valor * (taxa_decimal * (1 + taxa_decimal)**meses) / ((1 + taxa_decimal)**meses - 1)
total = parcela * meses
print(f"\nParcela mensal: R$ {parcela:.2f}")
print(f"Total a pagar: R$ {total:.2f}")
print(f"Juros totais:  R$ {total - valor:.2f}")
