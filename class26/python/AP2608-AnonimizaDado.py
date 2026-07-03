# Boa pratica de LGPD: mascarar dado sensivel
cpf = "123.456.789-00"
mascarado = "***." + cpf[4:7] + ".***-**"
print("CPF anonimizado:", mascarado)
