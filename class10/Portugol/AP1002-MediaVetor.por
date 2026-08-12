// Media dos elementos de um vetor
programa {
    funcao inicio() {
        const inteiro MAX = 5
        real notas[5]
        real soma = 0.0
        inteiro i
        para (i = 0; i <= MAX - 1; i++) {
            escreva("Nota ", i + 1, ": ")
            leia(notas[i])
            soma = soma + notas[i]
        }
        escreva("Media: ", soma / MAX)
    }
}
