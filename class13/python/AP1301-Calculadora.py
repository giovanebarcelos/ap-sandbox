while True:
    print("1-Somar 2-Subtrair 3-Mult 4-Div 5-Sair")
    op = int(input("Opção: "))
    if op == 5: break
    if 1 <= op <= 4:
        a = float(input("N1: ")); b = float(input("N2: "))
        if op == 1: r = a + b
        elif op == 2: r = a - b
        elif op == 3: r = a * b
        elif op == 4: r = a / b if b != 0 else "Erro: div por zero"
        print(f"Resultado: {r}")
