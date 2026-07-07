# JogoParOuImpar — Aula 21
# Jogo de par ou ímpar contra o computador

import random
print("=== PAR OU ÍMPAR ===")
jogador = int(input("Escolha um número (0-10): "))
computador = random.randint(0, 10)
soma = jogador + computador
print(f"Você: {jogador} | Computador: {computador} | Soma: {soma}")
if soma % 2 == 0:
    print("Soma PAR — Venceu quem escolheu PAR!")
else:
    print("Soma ÍMPAR — Venceu quem escolheu ÍMPAR!")
