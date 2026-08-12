programa {
    funcao inteiro maiorDeTres(inteiro a, inteiro b, inteiro c) {
        inteiro m
        m = a
        se (b > m) {
            m = b
        }
        se (c > m) {
            m = c
        }
        retorne m
    }

    funcao inicio() {
        escreva("Maior: ", maiorDeTres(12, 45, 23))
    }
}
