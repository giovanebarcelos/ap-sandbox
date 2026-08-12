programa {
    funcao inicio() {
        inteiro n, i, j
        cadeia linha
        escreva("Tamanho do quadrado: ")
        leia(n)
        para (i = 1; i <= n; i++) {
            linha = ""
            para (j = 1; j <= n; j++) {
                linha = linha + "* "
            }
            escreva(linha)
        }
    }
}
