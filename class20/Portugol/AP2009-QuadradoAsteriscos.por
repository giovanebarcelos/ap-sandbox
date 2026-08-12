programa {
    funcao inicio() {
        inteiro n = 4
        inteiro i, j
        cadeia linha
        para (i = 1; i <= n; i++) {
            linha = ""
            para (j = 1; j <= n; j++) {
                linha = linha + "*"
            }
            escreva(linha)
        }
    }
}
