// Vetor: declaracao, atribuicao e acesso por indice
programa {
    funcao inicio() {
        real notas[5] = {7.5, 8.0, 6.5, 9.0, 7.0}
        notas[0] = 10.0   // altera o primeiro elemento
        escreva("Terceiro elemento (indice 2): ", notas[2])

        cadeia linha = ""
        inteiro i
        para (i = 0; i <= 4; i++) {
            linha = linha + notas[i] + " "
        }
        escreva("Vetor completo: ", linha)
        escreva("Tamanho: 5")
    }
}
