programa {
    funcao inicio() {
        inteiro nota = 85
        cadeia c
        se nota >= 90 entao
            c = "A"
        senao se nota >= 80 entao
            c = "B"
        senao se nota >= 70 entao
            c = "C"
        senao se nota >= 60 entao
            c = "D"
        senao
            c = "F"
        fimse
        escreva("Conceito: ", c)
    }
}
