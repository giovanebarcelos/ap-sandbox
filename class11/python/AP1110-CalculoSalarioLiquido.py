# CalculoSalarioLiquido — Aula 11
# Entrada → Processamento → Saída: salário com descontos

horas = float(input("Horas trabalhadas: "))
valor_hora = float(input("Valor por hora: R$ "))
bruto = horas * valor_hora
inss = bruto * 0.08
liquido = bruto - inss
print(f"Salário Bruto:   R$ {bruto:.2f}")
print(f"Desconto INSS:   R$ {inss:.2f}")
print(f"Salário Líquido: R$ {liquido:.2f}")
