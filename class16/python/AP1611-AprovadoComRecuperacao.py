# AprovadoComRecuperacao — Aula 16
# Aprovação com recuperação usando AND e OR

nota = float(input("Nota final: "))
freq = float(input("Frequência (%): "))
if nota >= 70 and freq >= 75:
    print("APROVADO!")
elif nota >= 40 and freq >= 75:
    print("RECUPERAÇÃO")
else:
    print("REPROVADO")
print(f"Nota: {nota} | Frequência: {freq}%")
