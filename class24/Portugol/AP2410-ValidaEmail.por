programa {
    funcao logico validarEmail(cadeia email) {
        inteiro tam, i, arroba
        logico temPonto
        cadeia c

        tam = cadeia_tamanho(email)
        arroba = -1
        para i de 0 ate tam - 1 passo 1 faca
            c = email[i]
            se c == "@" entao
                se arroba == -1 entao
                    arroba = i
                fimse
            fimse
        fimpara

        se arroba == -1 entao
            retorne falso
        fimse

        temPonto = falso
        para i de arroba + 1 ate tam - 1 passo 1 faca
            c = email[i]
            se c == "." entao
                temPonto = verdadeiro
            fimse
        fimpara

        retorne temPonto
    }

    funcao inicio() {
        cadeia email
        escreva("Digite seu email: ")
        leia(email)

        se validarEmail(email) entao
            escreva("Email ", email, " eh VALIDO!")
        senao
            escreva("Email ", email, " eh INVALIDO!")
        fimse
    }
}
