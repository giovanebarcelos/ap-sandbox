# FuncaoFatorial — Aula 22
# Função que calcula o fatorial de um número

def fatorial(n):
    if n < 0:
        return None
    resultado = 1
    for i in range(2, n + 1):
        resultado *= i
    return resultado

num = int(input("Digite um número: "))
fat = fatorial(num)
if fat is None:
    print("Não existe fatorial de número negativo!")
else:
    print(f"{num}! = {fat}")
