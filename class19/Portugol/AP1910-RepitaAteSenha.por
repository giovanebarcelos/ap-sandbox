programa {
    funcao inicio() {
        cadeia senhaCorreta = "1234"
        cadeia senha
        repita
            escreva("Digite a senha: ")
            leia(senha)
            se (senha != senhaCorreta) entao
                escreva("Senha incorreta. Tente novamente.")
            fimse
        ate (senha == senhaCorreta)
        escreva("Acesso permitido!")
    }
}
