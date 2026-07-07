# SistemaVotacao — Aula 25
# Sistema simples de votação com 3 candidatos

votos = [0, 0, 0, 0]  # candidatos 1,2,3 + nulos
print("=== VOTAÇÃO ===\n1 - Candidato A\n2 - Candidato B\n3 - Candidato C\n0 - Sair")
while True:
    voto = int(input("Seu voto: "))
    if voto == 0:
        break
    if 1 <= voto <= 3:
        votos[voto - 1] += 1
    else:
        votos[3] += 1
print(f"\nResultado:\n  Candidato A: {votos[0]} votos\n  Candidato B: {votos[1]} votos\n  Candidato C: {votos[2]} votos\n  Nulos: {votos[3]}")
