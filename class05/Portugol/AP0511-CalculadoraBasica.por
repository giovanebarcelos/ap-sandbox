programa {
    funcao inicio() {
        real a, b

        escreva("Digite o primeiro número: ")
        leia(a)
        escreva("Digite o segundo número: ")
        leia(b)

        escreva("Soma: ", a + b)
        escreva("Subtração: ", a - b)
        escreva("Multiplicação: ", a * b)

        se b != 0 entao
            escreva("Divisão: ", a / b)
        senao
            escreva("Divisão: Não é possível dividir por zero")
        fimse
    }
}
