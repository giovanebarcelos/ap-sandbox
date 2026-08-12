programa {
    funcao inicio() {
        cadeia senhaCorreta = "1234"
        cadeia senha
        faca {
            escreva("Digite a senha: ")
            leia(senha)
            se (senha != senhaCorreta) {
                escreva("Senha incorreta. Tente novamente.")
            }
        } enquanto (!(senha == senhaCorreta))
        escreva("Acesso permitido!")
    }
}
