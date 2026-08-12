programa {
    funcao inicio() {
        logico a, b
        inteiro ai, bi, eAB, ouAB

        escreva("A B | A E B | A OU B")

        para (ai = 1; ai >= 0; ai = ai - 1) {
            para (bi = 1; bi >= 0; bi = bi - 1) {
                a = ai == 1
                b = bi == 1
                se (a e b) {
                    eAB = 1
                } senao {
                    eAB = 0
                }
                se (a ou b) {
                    ouAB = 1
                } senao {
                    ouAB = 0
                }
                escreva(ai, " ", bi, " |  ", eAB, "    |  ", ouAB)
            }
        }
    }
}
