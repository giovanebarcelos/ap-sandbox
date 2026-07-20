// Vetor: declaracao, atribuicao e acesso por indice
programa {
    funcao inicio() {
        real notas[5] = {7.5, 8.0, 6.5, 9.0, 7.0}
        notas[0] = 10.0   // altera o primeiro elemento
        escreva("Terceiro elemento (indice 2): ", notas[2])

        cadeia linha = ""
        inteiro i
        para i de 0 ate 4 faca
            linha = linha + notas[i] + " "
        fimpara
        escreva("Vetor completo: ", linha)
        escreva("Tamanho: 5")
    }
}
