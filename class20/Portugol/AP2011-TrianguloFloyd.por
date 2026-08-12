programa {
    funcao inicio() {
        inteiro n, num, i, j
        cadeia linha, numStr
        escreva("Número de linhas: ")
        leia(n)
        num = 1
        para (i = 1; i <= n; i++) {
            linha = ""
            para (j = 1; j <= i; j++) {
                se (num < 10) {
                    numStr = "  " + num
                } senao se (num < 100) {
                    numStr = " " + num
                } senao {
                    numStr = "" + num
                }
                linha = linha + numStr
                num = num + 1
            }
            escreva(linha)
        }
    }
}
