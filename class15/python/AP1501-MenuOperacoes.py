# Menu de operacoes com estrutura de multipla escolha
print("1 - Somar")
print("2 - Subtrair")
print("3 - Multiplicar")
opcao = int(input("Escolha uma opcao: "))
a = float(input("Primeiro numero: "))
b = float(input("Segundo numero: "))
if opcao == 1:
    print("Resultado:", a + b)
elif opcao == 2:
    print("Resultado:", a - b)
elif opcao == 3:
    print("Resultado:", a * b)
else:
    print("Opcao invalida")
