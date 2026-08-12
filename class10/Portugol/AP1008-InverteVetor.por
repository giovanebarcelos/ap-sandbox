programa {
    funcao inicio() {
        inteiro v[5] = {1, 2, 3, 4, 5}
        cadeia linha = ""
        inteiro i
        para (i = 4; i >= 0; i = i - 1) {
            linha = linha + v[i] + " "
        }
        escreva("Invertido: ", linha)
    }
}
