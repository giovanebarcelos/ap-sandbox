# FuncaoPrimo — Aula 23
# Função que verifica se um número é primo

def eh_primo(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

num = int(input("Digite um número: "))
if eh_primo(num):
    print(f"{num} é PRIMO!")
else:
    print(f"{num} NÃO é primo.")
