programa {
    funcao inicio() {
        inteiro N = 5
        inteiro i, j
        cadeia linha
        para i de 1 ate N faca
            linha = ""
            para j de 1 ate i faca
                linha = linha + "*"
            fimpara
            escreva(linha)
        fimpara
        escreva("")
        para i de N ate 1 passo -1 faca
            linha = ""
            para j de 1 ate i faca
                linha = linha + "*"
            fimpara
            escreva(linha)
        fimpara
    }
}
