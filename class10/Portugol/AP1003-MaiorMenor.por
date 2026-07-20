// Maior e menor de um vetor
programa {
    funcao inicio() {
        inteiro numeros[10] = {4, 15, 8, 23, 16, 42, 7, 11, 9, 30}
        inteiro maior, menor, i
        maior = numeros[0]
        menor = numeros[0]
        para i de 1 ate 9 faca
            se numeros[i] > maior entao
                maior = numeros[i]
            fimse
            se numeros[i] < menor entao
                menor = numeros[i]
            fimse
        fimpara

        cadeia linha = ""
        para i de 0 ate 9 faca
            linha = linha + numeros[i] + " "
        fimpara
        escreva("Vetor: ", linha)
        escreva("Maior: ", maior)
        escreva("Menor: ", menor)
    }
}
