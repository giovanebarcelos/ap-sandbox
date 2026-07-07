# RepitaAteSenha — Aula 19
# Loop repita...até para validar senha

senha_correta = "1234"
while True:
    senha = input("Digite a senha: ")
    if senha == senha_correta:
        print("Acesso permitido!")
        break
    print("Senha incorreta. Tente novamente.")
