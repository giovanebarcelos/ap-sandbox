programa {
    funcao inicio() {
        inteiro secreto, tent, i
        inteiro palpites[4] = {50, 25, 40, 42}

        secreto = 42
        tent = 0

        para (i = 0; i <= 3; i++) {
            tent = tent + 1
            se (palpites[i] == secreto) {
                escreva("Acertou em ", tent, " tentativas")
                retorne
            }
        }
    }
}
