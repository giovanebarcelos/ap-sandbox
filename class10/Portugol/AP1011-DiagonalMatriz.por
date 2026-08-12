// DiagonalMatriz - Aula 10
// Extrai e exibe a diagonal principal de uma matriz 3x3
programa {
    funcao inicio() {
        inteiro matriz[3][3] = {{5, 2, 8}, {3, 7, 1}, {9, 4, 6}}
        escreva("Matriz 3x3:")
        inteiro i, j
        para (i = 0; i <= 2; i++) {
            cadeia linha = ""
            para (j = 0; j <= 2; j++) {
                linha = linha + matriz[i][j] + "  "
            }
            escreva(linha)
        }
        escreva("")
        escreva("Diagonal principal:")
        para (i = 0; i <= 2; i++) {
            escreva("  m[", i, "][", i, "] = ", matriz[i][i])
        }
    }
}
