// BuscaNoVetor - Aula 10
// Busca um valor em um vetor e retorna o indice
programa {
    funcao inicio() {
        inteiro numeros[7] = {10, 25, 33, 47, 52, 68, 71}
        inteiro buscado, i
        logico encontrado = falso
        escreva("Digite o número a buscar: ")
        leia(buscado)
        i = 0
        enquanto ((i < 7) e (nao encontrado)) {
            se (numeros[i] == buscado) {
                escreva("Encontrado na posição ", i, "!")
                encontrado = verdadeiro
            }
            i = i + 1
        }
        se (nao encontrado) {
            escreva("Número não encontrado no vetor.")
        }
    }
}
