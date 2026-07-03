# Biblioteca de funcoes matematicas
def fatorial(n):
    resultado = 1
    for i in range(2, n + 1):
        resultado *= i
    return resultado


def eh_primo(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True


def mdc(a, b):
    while b != 0:
        a, b = b, a % b
    return a


print("5! =", fatorial(5))            # 120
print("7 e primo?", eh_primo(7))      # True
print("mdc(12, 18) =", mdc(12, 18))   # 6
