# FuncaoPotencia — Aula 23
# Função que calcula a potência (base^expoente) sem usar **

def potencia(base, expoente):
    if expoente == 0:
        return 1
    resultado = 1
    for _ in range(abs(expoente)):
        resultado *= base
    if expoente < 0:
        return 1 / resultado
    return resultado

b = float(input("Base: "))
e = int(input("Expoente: "))
print(f"{b}^{e} = {potencia(b, e):.4f}")
