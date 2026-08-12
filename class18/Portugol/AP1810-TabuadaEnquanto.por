programa {
    funcao inicio() {
        inteiro n, i
        escreva("Digite um número: ")
        leia(n)
        i = 1
        enquanto (i <= 10) {
            escreva(n, " × ", i, " = ", n * i)
            i = i + 1
        }
    }
}
