// Tabuada 10x10 em matriz: m[i][j] = (i+1) * (j+1)
programa {
    funcao inicio() {
        const inteiro N = 10
        inteiro m[10][10]
        inteiro i, j
        para i de 0 ate N - 1 faca
            para j de 0 ate N - 1 faca
                m[i][j] = (i + 1) * (j + 1)
            fimpara
        fimpara
        para i de 0 ate N - 1 faca
            cadeia linha = ""
            para j de 0 ate N - 1 faca
                linha = linha + m[i][j] + " "
            fimpara
            escreva(linha)
        fimpara
    }
}
