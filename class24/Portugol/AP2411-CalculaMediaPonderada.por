programa {
    funcao real mediaPonderada(real notas, inteiro pesos, inteiro tam) {
        real somaNotas
        inteiro somaPesos, i

        somaNotas = 0
        somaPesos = 0
        para (i = 0; i <= tam - 1; i = i + 1) {
            somaNotas = somaNotas + notas[i] * pesos[i]
            somaPesos = somaPesos + pesos[i]
        }

        se (somaPesos > 0) {
            retorne somaNotas / somaPesos
        }
        retorne 0
    }

    funcao inicio() {
        real notas[3] = {8.5, 7.0, 9.0}
        inteiro pesos[3] = {2, 3, 5}
        real media

        escreva("Notas: ", notas[0], " ", notas[1], " ", notas[2])
        escreva("Pesos: ", pesos[0], " ", pesos[1], " ", pesos[2])

        media = mediaPonderada(notas, pesos, 3)
        escreva("Média Ponderada: ", media)
    }
}
