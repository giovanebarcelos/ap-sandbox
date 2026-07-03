# Media de duas notas e situacao do aluno
n1 = float(input("Nota 1: "))
n2 = float(input("Nota 2: "))
media = (n1 + n2) / 2
print(f"Media: {media:.1f}")
if media >= 7:
    print("APROVADO")
elif media >= 5:
    print("RECUPERACAO")
else:
    print("REPROVADO")
