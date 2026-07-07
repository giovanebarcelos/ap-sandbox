# AnonimizadorSimples — Aula 26
# Anonimizador de dados (substitui nome por hash simples)

nome = input("Nome completo: ")
partes = nome.split()
anonimizado = partes[0][0] + "*** " + partes[-1][0] + "***"
print(f"Nome original: {nome}")
print(f"Nome anonimizado: {anonimizado}")
print("Dados anonimizados protegem a privacidade (LGPD).")
