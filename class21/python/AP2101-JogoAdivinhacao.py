import random
s = random.randint(1, 100)
t = 0
while True:
    p = int(input("Palpite: ")); t += 1
    if p < s: print("MAIOR")
    elif p > s: print("MENOR")
    else: print(f"ACERTOU em {t} tentativas!"); break
