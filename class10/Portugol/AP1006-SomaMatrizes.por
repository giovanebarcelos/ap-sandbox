// Soma de duas matrizes de mesmo tamanho
programa {
    funcao inicio() {
        const inteiro LIN = 2
        const inteiro COL = 3
        inteiro a[2][3] = {{1, 2, 3}, {4, 5, 6}}
        inteiro b[2][3] = {{10, 20, 30}, {40, 50, 60}}
        inteiro c[2][3]
        inteiro i, j
        para (i = 0; i <= LIN - 1; i++) {
            para (j = 0; j <= COL - 1; j++) {
                c[i][j] = a[i][j] + b[i][j]
            }
        }
        escreva("Matriz soma:")
        para (i = 0; i <= LIN - 1; i++) {
            cadeia linha = ""
            para (j = 0; j <= COL - 1; j++) {
                linha = linha + c[i][j] + " "
            }
            escreva(linha)
        }
    }
}
