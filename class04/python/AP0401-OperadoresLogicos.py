idade = int(input("Idade: "))
tem_titulo = input("Tem titulo? (s/n): ").lower() == "s"
if idade >= 16 and tem_titulo:
    print("Pode votar")
else:
    print("Nao pode votar")
