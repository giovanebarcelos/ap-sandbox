# CalculaMediaPonderada — Aula 24
# Função que calcula média ponderada

def media_ponderada(notas, pesos):
    soma_notas = sum(n * p for n, p in zip(notas, pesos))
    soma_pesos = sum(pesos)
    return soma_notas / soma_pesos if soma_pesos > 0 else 0

notas = [8.5, 7.0, 9.0]
pesos = [2, 3, 5]
media = media_ponderada(notas, pesos)
print(f"Notas: {notas}")
print(f"Pesos: {pesos}")
print(f"Média Ponderada: {media:.2f}")
