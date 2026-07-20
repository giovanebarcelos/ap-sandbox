programa {
    funcao inicio() {
        inteiro m[3][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
        inteiro i, j, s
        para i de 0 ate 2 faca
            s = 0
            para j de 0 ate 2 faca
                s = s + m[i][j]
            fimpara
            escreva("Linha ", i, ": ", s)
        fimpara
    }
}
