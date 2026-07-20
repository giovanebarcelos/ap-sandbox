// Media dos elementos de um vetor
programa {
    funcao inicio() {
        const inteiro MAX = 5
        real notas[5]
        real soma = 0.0
        inteiro i
        para i de 0 ate MAX - 1 faca
            escreva("Nota ", i + 1, ": ")
            leia(notas[i])
            soma = soma + notas[i]
        fimpara
        escreva("Media: ", soma / MAX)
    }
}
