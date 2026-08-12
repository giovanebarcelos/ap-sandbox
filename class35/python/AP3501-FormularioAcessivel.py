def validar_campo(nome_campo, valor):
    if not valor or not valor.strip():
        print(f"[CAMPO OBRIGATORIO] Preencha {nome_campo} para continuar.")
        raise ValueError(f"{nome_campo} vazio")


try:
    validar_campo("Nome", "Ana")
    print("Nome valido")
    validar_campo("E-mail", "")
except ValueError as e:
    print(f"Cadastro interrompido: {e}")
