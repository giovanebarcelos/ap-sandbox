programa {
    funcao inicio() {
        inteiro a = 3
        inteiro b = 3
        inteiro c = 5

        se (a == b) e (b == c) entao
            escreva("Equilatero")
        senao se (a == b) ou (b == c) ou (a == c) entao
            escreva("Isosceles")
        senao
            escreva("Escaleno")
        fimse
    }
}
