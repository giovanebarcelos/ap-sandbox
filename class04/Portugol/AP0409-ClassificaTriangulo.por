programa {
    funcao inicio() {
        inteiro a = 3
        inteiro b = 3
        inteiro c = 5

        se ((a == b) e (b == c)) {
            escreva("Equilatero")
        } senao se ((a == b) ou (b == c) ou (a == c)) {
            escreva("Isosceles")
        } senao {
            escreva("Escaleno")
        }
    }
}
