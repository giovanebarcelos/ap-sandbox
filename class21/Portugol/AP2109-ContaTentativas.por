programa {
    funcao inicio() {
        inteiro secreto, tent, i
        inteiro palpites[4] = {50, 25, 40, 42}

        secreto = 42
        tent = 0

        para i de 0 ate 3 faca
            tent = tent + 1
            se palpites[i] == secreto entao
                escreva("Acertou em ", tent, " tentativas")
                retorne
            fimse
        fimpara
    }
}
