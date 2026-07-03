secreto = 42
palpites = [50, 25, 40, 42]
tent = 0
for p in palpites:
    tent += 1
    if p == secreto:
        break
print(f"Acertou em {tent} tentativas")
