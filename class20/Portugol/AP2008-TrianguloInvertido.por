programa {
    funcao inicio() {
        inteiro i, j
        cadeia linha
        para (i = 5; i >= 1; i = i - 1) {
            linha = ""
            para (j = 1; j <= i; j++) {
                linha = linha + "*"
            }
            escreva(linha)
        }
    }
}
