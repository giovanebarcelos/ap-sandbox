class ValorInvalidoError(Exception):
    pass


def dividir(a, b):
    return a / b


def depositar(saldo, valor):
    if valor <= 0:
        raise ValorInvalidoError("valor deve ser positivo")
    return saldo + valor


try:
    resultado = 10 / 0
except ZeroDivisionError:
    print("Erro: divisao por zero")

try:
    novo_saldo = depositar(100.0, -50.0)
except ValorInvalidoError as e:
    print(f"Erro: {e}")

print("Programa continuou rodando normalmente")
