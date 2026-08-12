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

        se (op == "+") {
            escreva("Resultado: ", a + b)
        } senao se (op == "-") {
            escreva("Resultado: ", a - b)
        } senao se (op == "*") {
            escreva("Resultado: ", a * b)
        } senao se (op == "/") {
            se (b != 0) {
                escreva("Resultado: ", a / b)
            } senao {
                escreva("Erro: divisao por zero")
            }
        } senao {
            escreva("Operacao invalida")
        }
    }
}
