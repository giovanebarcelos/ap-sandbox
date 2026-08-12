programa {
    funcao inicio() {
        logico a, b
        inteiro ai, bi

        escreva("A | B | A AND B")
        escreva("--+---+-------")

        para (ai = 1; ai >= 0; ai = ai - 1) {
            para (bi = 1; bi >= 0; bi = bi - 1) {
                a = ai == 1
                b = bi == 1
                se (a e b) {
                    escreva(a, " | ", b, " | verdadeiro")
                } senao {
                    escreva(a, " | ", b, " | falso")
                }
            }
        }
    }
}
