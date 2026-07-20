// Soma de duas matrizes de mesmo tamanho
programa {
    funcao inicio() {
        const inteiro LIN = 2
        const inteiro COL = 3
        inteiro a[2][3] = {{1, 2, 3}, {4, 5, 6}}
        inteiro b[2][3] = {{10, 20, 30}, {40, 50, 60}}
        inteiro c[2][3]
        inteiro i, j
        para i de 0 ate LIN - 1 faca
            para j de 0 ate COL - 1 faca
                c[i][j] = a[i][j] + b[i][j]
            fimpara
        fimpara
        escreva("Matriz soma:")
        para i de 0 ate LIN - 1 faca
            cadeia linha = ""
            para j de 0 ate COL - 1 faca
                linha = linha + c[i][j] + " "
            fimpara
            escreva(linha)
        fimpara
    }
}
