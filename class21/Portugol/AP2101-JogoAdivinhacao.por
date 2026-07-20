programa {
    funcao inicio() {
        inteiro secreto, palpite, tentativas

        secreto = sorteia(1, 100)
        tentativas = 0

        repita
            escreva("Palpite: ")
            leia(palpite)
            tentativas = tentativas + 1
            se palpite < secreto entao
                escreva("MAIOR")
            senao se palpite > secreto entao
                escreva("MENOR")
            senao
                escreva("ACERTOU em ", tentativas, " tentativas!")
            fimse
        ate (palpite == secreto)
    }
}
