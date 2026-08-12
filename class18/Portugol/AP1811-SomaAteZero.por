programa {
    funcao inicio() {
        real soma, n
        soma = 0
        escreva("Digite um número (0 para sair): ")
        leia(n)
        enquanto (n != 0) {
            soma = soma + n
            escreva("Digite um número (0 para sair): ")
            leia(n)
        }
        escreva("Soma total: ", soma)
    }
}
