# Verifica se um ano e bissexto
ano = int(input("Digite o ano: "))
bissexto = (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0)
print(f"{ano} {'E' if bissexto else 'NAO e'} bissexto")
