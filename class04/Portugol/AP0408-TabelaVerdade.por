programa {
    funcao inicio() {
        logico a, b
        inteiro ai, bi, eAB, ouAB

        escreva("A B | A E B | A OU B")

        para ai de 1 ate 0 passo -1 faca
            para bi de 1 ate 0 passo -1 faca
                a = ai == 1
                b = bi == 1
                se a e b entao
                    eAB = 1
                senao
                    eAB = 0
                fimse
                se a ou b entao
                    ouAB = 1
                senao
                    ouAB = 0
                fimse
                escreva(ai, " ", bi, " |  ", eAB, "    |  ", ouAB)
            fimpara
        fimpara
    }
}
