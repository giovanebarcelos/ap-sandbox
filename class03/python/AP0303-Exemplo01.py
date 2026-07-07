# TrocarLampada — Aula 03
# Algoritmo para trocar uma lâmpada (sequencial com decisão)

print("Passo 1: Pegar uma lâmpada nova.")
print("Passo 2: Subir na escada com cuidado.")
tem_energia = input("A energia está desligada? (s/n): ")
if tem_energia.lower() == "s":
    print("Passo 3: Retirar lâmpada queimada.")
    print("Passo 4: Rosquear lâmpada nova.")
    print("Passo 5: Ligar interruptor para testar.")
else:
    print("Desligue a energia primeiro!")
