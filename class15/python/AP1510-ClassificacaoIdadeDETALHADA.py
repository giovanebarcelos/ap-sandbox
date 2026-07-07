# ClassificacaoIdadeDETALHADA — Aula 15
# Classifica faixa etária com escolha/caso (simulado com if-elif)

idade = int(input("Idade: "))
if idade < 0:
    print("Idade inválida!")
elif idade <= 12:
    print("Criança")
elif idade <= 17:
    print("Adolescente")
elif idade <= 59:
    print("Adulto")
elif idade <= 120:
    print("Idoso")
else:
    print("Idade improvável!")
