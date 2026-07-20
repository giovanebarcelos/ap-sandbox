programa {
    funcao inicio() {
        inteiro idade
        escreva("Idade: ")
        leia(idade)

        se idade < 12 entao
            escreva("Crianca")
        senao se idade < 18 entao
            escreva("Adolescente")
        senao se idade < 60 entao
            escreva("Adulto")
        senao
            escreva("Idoso")
        fimse
    }
}
