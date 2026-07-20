programa {
    funcao inicio() {
        real a, b
        cadeia op

        escreva("Primeiro numero: ")
        leia(a)
        escreva("Operacao (+ - * /): ")
        leia(op)
        escreva("Segundo numero: ")
        leia(b)

        se op == "+" entao
            escreva("Resultado: ", a + b)
        senao se op == "-" entao
            escreva("Resultado: ", a - b)
        senao se op == "*" entao
            escreva("Resultado: ", a * b)
        senao se op == "/" entao
            se b != 0 entao
                escreva("Resultado: ", a / b)
            senao
                escreva("Erro: divisao por zero")
            fimse
        senao
            escreva("Operacao invalida")
        fimse
    }
}
