programa {
    funcao inicio() {
        inteiro n, i, soma
        escreva("N: ")
        leia(n)
        soma = 0
        para (i = 1; i <= n; i++) {
            soma = soma + i
        }
        escreva("Soma de 1 a ", n, " = ", soma)
    }
}
