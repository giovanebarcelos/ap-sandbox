programa {
    funcao inicio() {
        inteiro N = 5
        inteiro i, j
        cadeia linha
        para (i = 1; i <= N; i++) {
            linha = ""
            para (j = 1; j <= i; j++) {
                linha = linha + "*"
            }
            escreva(linha)
        }
        escreva("")
        para (i = N; i >= 1; i = i - 1) {
            linha = ""
            para (j = 1; j <= i; j++) {
                linha = linha + "*"
            }
            escreva(linha)
        }
    }
}
