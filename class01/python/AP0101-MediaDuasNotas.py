# Media de duas notas com aprovacao/reprovacao
nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))
media = (nota1 + nota2) / 2
print(f"Media: {media:.1f}")
print("Aprovado" if media >= 7 else "Reprovado")
