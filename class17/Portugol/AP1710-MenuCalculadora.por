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
        se (op == 1) {
            escreva(a, " + ", b, " = ", a + b)
        } senao se (op == 2) {
            escreva(a, " - ", b, " = ", a - b)
        } senao se (op == 3) {
            escreva(a, " × ", b, " = ", a * b)
        } senao se (op == 4) {
            se (b != 0) {
                escreva(a, " ÷ ", b, " = ", a / b)
            } senao {
                escreva("Erro: divisão por zero!")
            }
        } senao {
            escreva("Opção inválida!")
        }
    }
}
