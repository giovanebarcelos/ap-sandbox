// Matriz (variavel indexada bidimensional): declaracao e acesso m[i][j]
programa {
    funcao inicio() {
        inteiro m[2][3] = {{1, 2, 3}, {4, 5, 6}}
        escreva("m[0][2] = ", m[0][2])   // 3
        escreva("m[1][0] = ", m[1][0])   // 4
        escreva("Matriz completa:")
        inteiro i, j
        para i de 0 ate 1 faca
            cadeia linha = ""
            para j de 0 ate 2 faca
                linha = linha + m[i][j] + " "
            fimpara
            escreva(linha)
        fimpara
    }
}
