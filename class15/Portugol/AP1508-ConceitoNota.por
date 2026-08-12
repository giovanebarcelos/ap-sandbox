programa {
    funcao inicio() {
        inteiro nota = 85
        cadeia c
        se (nota >= 90) {
            c = "A"
        } senao se (nota >= 80) {
            c = "B"
        } senao se (nota >= 70) {
            c = "C"
        } senao se (nota >= 60) {
            c = "D"
        } senao {
            c = "F"
        }
        escreva("Conceito: ", c)
    }
}
