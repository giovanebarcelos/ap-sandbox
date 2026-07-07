# BoasPraticasNomes — Aula 09
# Demonstra boas práticas de nomenclatura de variáveis

# Nomes significativos revelam a intenção
salario_bruto = 5000.00
desconto_inss = salario_bruto * 0.11
desconto_ir = salario_bruto * 0.075
salario_liquido = salario_bruto - desconto_inss - desconto_ir
print(f"Salário Bruto: R$ {salario_bruto:.2f}")
print(f"Desconto INSS: R$ {desconto_inss:.2f}")
print(f"Desconto IR:   R$ {desconto_ir:.2f}")
print(f"Salário Líquido: R$ {salario_liquido:.2f}")
