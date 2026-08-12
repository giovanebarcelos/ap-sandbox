inclua biblioteca Util --> u

programa {
    funcao inicio() {
        inteiro secreto, palpite, tentativas

        secreto = u.sorteia(1, 100)
        tentativas = 0

        faca {
            escreva("Palpite: ")
            leia(palpite)
            tentativas = tentativas + 1
            se (palpite < secreto) {
                escreva("MAIOR")
            } senao se (palpite > secreto) {
                escreva("MENOR")
            } senao {
                escreva("ACERTOU em ", tentativas, " tentativas!")
            }
        } enquanto (!(palpite == secreto))
    }
}
