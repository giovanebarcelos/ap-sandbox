// DiagonalMatriz - Aula 10
// Extrai e exibe a diagonal principal de uma matriz 3x3
programa {
    funcao inicio() {
        inteiro matriz[3][3] = {{5, 2, 8}, {3, 7, 1}, {9, 4, 6}}
        escreva("Matriz 3x3:")
        inteiro i, j
        para i de 0 ate 2 faca
            cadeia linha = ""
            para j de 0 ate 2 faca
                linha = linha + matriz[i][j] + "  "
            fimpara
            escreva(linha)
        fimpara
        escreva("")
        escreva("Diagonal principal:")
        para i de 0 ate 2 faca
            escreva("  m[", i, "][", i, "] = ", matriz[i][i])
        fimpara
    }
}
