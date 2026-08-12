programa {
    funcao inicio() {
        real a, b, c
        escreva("Lado a: ")
        leia(a)
        escreva("Lado b: ")
        leia(b)
        escreva("Lado c: ")
        leia(c)
        se ((a < b + c) e (b < a + c) e (c < a + b)) {
            se ((a == b) e (b == c)) {
                escreva("Triangulo EQUILATERO")
            } senao se ((a == b) ou (b == c) ou (a == c)) {
                escreva("Triangulo ISOSCELES")
            } senao {
                escreva("Triangulo ESCALENO")
            }
        } senao {
            escreva("Nao formam um triangulo")
        }
    }
}
