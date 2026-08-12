def validar_campo(nome_campo, valor):
    if not valor or not valor.strip():
        print(f"[CAMPO OBRIGATORIO] Preencha {nome_campo} para continuar.")
        raise ValueError(f"{nome_campo} vazio")


def validar_numero(nome_campo, valor):
    try:
        int(valor)
    except ValueError:
        print(f"[FORMATO INVALIDO] {nome_campo} deve conter apenas numeros.")
        raise ValueError(f"{nome_campo} invalido")


campos = [("Nome", "Ana"), ("Idade", "abc"), ("Cidade", "")]

for nome, valor in campos:
    try:
        validar_campo(nome, valor)
        if nome == "Idade":
            validar_numero(nome, valor)
        print(f"{nome}: OK")
    except ValueError as e:
        print(f"{nome}: rejeitado ({e})")
