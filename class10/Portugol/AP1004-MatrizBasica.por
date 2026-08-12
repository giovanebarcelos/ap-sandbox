// Matriz (variavel indexada bidimensional): declaracao e acesso m[i][j]
programa {
    funcao inicio() {
        inteiro m[2][3] = {{1, 2, 3}, {4, 5, 6}}
        escreva("m[0][2] = ", m[0][2])   // 3
        escreva("m[1][0] = ", m[1][0])   // 4
        escreva("Matriz completa:")
        inteiro i, j
        para (i = 0; i <= 1; i++) {
            cadeia linha = ""
            para (j = 0; j <= 2; j++) {
                linha = linha + m[i][j] + " "
            }
            escreva(linha)
        }
    }
}
