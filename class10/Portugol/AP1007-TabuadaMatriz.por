// Tabuada 10x10 em matriz: m[i][j] = (i+1) * (j+1)
programa {
    funcao inicio() {
        const inteiro N = 10
        inteiro m[10][10]
        inteiro i, j
        para (i = 0; i <= N - 1; i++) {
            para (j = 0; j <= N - 1; j++) {
                m[i][j] = (i + 1) * (j + 1)
            }
        }
        para (i = 0; i <= N - 1; i++) {
            cadeia linha = ""
            para (j = 0; j <= N - 1; j++) {
                linha = linha + m[i][j] + " "
            }
            escreva(linha)
        }
    }
}
