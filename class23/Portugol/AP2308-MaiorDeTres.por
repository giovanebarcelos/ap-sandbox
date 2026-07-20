programa {
    funcao inteiro maiorDeTres(inteiro a, inteiro b, inteiro c) {
        inteiro m
        m = a
        se b > m entao
            m = b
        fimse
        se c > m entao
            m = c
        fimse
        retorne m
    }

    funcao inicio() {
        escreva("Maior: ", maiorDeTres(12, 45, 23))
    }
}
