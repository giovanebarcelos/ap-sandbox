programa {
    funcao inicio() {
        inteiro v[5] = {1, 2, 3, 4, 5}
        cadeia linha = ""
        inteiro i
        para i de 4 ate 0 passo -1 faca
            linha = linha + v[i] + " "
        fimpara
        escreva("Invertido: ", linha)
    }
}
