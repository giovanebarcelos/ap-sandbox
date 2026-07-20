programa {
    funcao inicio() {
        inteiro idade
        cadeia resp
        logico temTitulo

        escreva("Idade: ")
        leia(idade)
        escreva("Tem titulo? (s/n): ")
        leia(resp)

        temTitulo = (resp == "s") ou (resp == "S")

        se (idade >= 16) e (temTitulo) entao
            escreva("Pode votar")
        senao
            escreva("Nao pode votar")
        fimse
    }
}
