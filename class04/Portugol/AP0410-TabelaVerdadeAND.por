programa {
    funcao inicio() {
        logico a, b
        inteiro ai, bi

        escreva("A | B | A AND B")
        escreva("--+---+-------")

        para ai de 1 ate 0 passo -1 faca
            para bi de 1 ate 0 passo -1 faca
                a = ai == 1
                b = bi == 1
                se a e b entao
                    escreva(a, " | ", b, " | verdadeiro")
                senao
                    escreva(a, " | ", b, " | falso")
                fimse
            fimpara
        fimpara
    }
}
