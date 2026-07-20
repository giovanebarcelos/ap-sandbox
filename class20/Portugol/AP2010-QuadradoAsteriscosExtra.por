programa {
    funcao inicio() {
        inteiro n, i, j
        cadeia linha
        escreva("Tamanho do quadrado: ")
        leia(n)
        para i de 1 ate n faca
            linha = ""
            para j de 1 ate n faca
                linha = linha + "* "
            fimpara
            escreva(linha)
        fimpara
    }
}
