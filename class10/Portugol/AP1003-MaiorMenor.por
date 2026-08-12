// Maior e menor de um vetor
programa {
    funcao inicio() {
        inteiro numeros[10] = {4, 15, 8, 23, 16, 42, 7, 11, 9, 30}
        inteiro maior, menor, i
        maior = numeros[0]
        menor = numeros[0]
        para (i = 1; i <= 9; i++) {
            se (numeros[i] > maior) {
                maior = numeros[i]
            }
            se (numeros[i] < menor) {
                menor = numeros[i]
            }
        }

        cadeia linha = ""
        para (i = 0; i <= 9; i++) {
            linha = linha + numeros[i] + " "
        }
        escreva("Vetor: ", linha)
        escreva("Maior: ", maior)
        escreva("Menor: ", menor)
    }
}
