programa {
    funcao inicio() {
        real a, b, c
        escreva("Lado A: ")
        leia(a)
        escreva("Lado B: ")
        leia(b)
        escreva("Lado C: ")
        leia(c)
        se (a + b > c) e (a + c > b) e (b + c > a) entao
            escreva("É um triângulo!")
            se (a == b) e (b == c) entao
                escreva("Tipo: Equilátero")
            senao se (a == b) ou (a == c) ou (b == c) entao
                escreva("Tipo: Isósceles")
            senao
                escreva("Tipo: Escaleno")
            fimse
        senao
            escreva("Não forma um triângulo.")
        fimse
    }
}
