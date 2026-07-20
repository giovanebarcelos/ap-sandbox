// Menu de operacoes com estrutura de multipla escolha
programa {
    funcao inicio() {
        inteiro opcao
        real a
        real b
        escreva("1 - Somar")
        escreva("2 - Subtrair")
        escreva("3 - Multiplicar")
        escreva("Escolha uma opcao: ")
        leia(opcao)
        escreva("Primeiro numero: ")
        leia(a)
        escreva("Segundo numero: ")
        leia(b)
        se opcao == 1 entao
            escreva("Resultado: ", a + b)
        senao se opcao == 2 entao
            escreva("Resultado: ", a - b)
        senao se opcao == 3 entao
            escreva("Resultado: ", a * b)
        senao
            escreva("Opcao invalida")
        fimse
    }
}
