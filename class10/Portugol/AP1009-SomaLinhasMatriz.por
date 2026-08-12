programa {
    funcao inicio() {
        inteiro m[3][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
        inteiro i, j, s
        para (i = 0; i <= 2; i++) {
            s = 0
            para (j = 0; j <= 2; j++) {
                s = s + m[i][j]
            }
            escreva("Linha ", i, ": ", s)
        }
    }
}
