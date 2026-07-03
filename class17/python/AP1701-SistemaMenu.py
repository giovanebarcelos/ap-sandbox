# Sistema de menu interativo com validacao (UA5)
def menu():
    print("=== MENU PRINCIPAL ===")
    print("1 - Conversor Celsius -> Fahrenheit")
    print("2 - Calculadora de IMC")
    print("3 - Par ou Impar")
    print("4 - Maior de 3 numeros")
    print("5 - Sair")


opcao = 0
while opcao != 5:
    menu()
    opcao = int(input("Escolha uma opcao: "))
    if opcao == 1:
        c = float(input("Temperatura em Celsius: "))
        print(f"{c}C = {c * 9 / 5 + 32}F")
    elif opcao == 2:
        peso = float(input("Peso (kg): "))
        altura = float(input("Altura (m): "))
        print(f"IMC: {peso / (altura * altura):.1f}")
    elif opcao == 3:
        n = int(input("Numero: "))
        print("PAR" if n % 2 == 0 else "IMPAR")
    elif opcao == 4:
        a = float(input("a: "))
        b = float(input("b: "))
        c = float(input("c: "))
        print("Maior:", max(a, b, c))
    elif opcao == 5:
        print("Saindo...")
    else:
        print("Opcao invalida! Tente novamente.")
