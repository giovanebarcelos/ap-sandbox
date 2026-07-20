programa {
    funcao inicio() {
        inteiro op
        real a, b
        escreva("=== CALCULADORA ===")
        escreva("1 - Somar")
        escreva("2 - Subtrair")
        escreva("3 - Multiplicar")
        escreva("4 - Dividir")
        escreva("Escolha: ")
        leia(op)
        escreva("Número 1: ")
        leia(a)
        escreva("Número 2: ")
        leia(b)
        se (op == 1) entao
            escreva(a, " + ", b, " = ", a + b)
        senao se (op == 2) entao
            escreva(a, " - ", b, " = ", a - b)
        senao se (op == 3) entao
            escreva(a, " × ", b, " = ", a * b)
        senao se (op == 4) entao
            se (b != 0) entao
                escreva(a, " ÷ ", b, " = ", a / b)
            senao
                escreva("Erro: divisão por zero!")
            fimse
        senao
            escreva("Opção inválida!")
        fimse
    }
}
