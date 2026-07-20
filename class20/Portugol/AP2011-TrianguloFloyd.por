programa {
    funcao inicio() {
        inteiro n, num, i, j
        cadeia linha, numStr
        escreva("Número de linhas: ")
        leia(n)
        num = 1
        para i de 1 ate n faca
            linha = ""
            para j de 1 ate i faca
                se (num < 10) entao
                    numStr = "  " + num
                senao se (num < 100) entao
                    numStr = " " + num
                senao
                    numStr = "" + num
                fimse
                linha = linha + numStr
                num = num + 1
            fimpara
            escreva(linha)
        fimpara
    }
}
