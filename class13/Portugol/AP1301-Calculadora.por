programa {
    funcao inicio() {
        inteiro op = 0
        real a
        real b
        real r
        logico continuar = verdadeiro
        enquanto (continuar) {
            escreva("1-Somar 2-Subtrair 3-Mult 4-Div 5-Sair")
            escreva("Opção: ")
            leia(op)
            se (op == 5) {
                continuar = falso
            } senao se ((op >= 1) e (op <= 4)) {
                escreva("N1: ")
                leia(a)
                escreva("N2: ")
                leia(b)
                se (op == 1) {
                    r = a + b
                    escreva("Resultado: ", r)
                } senao se (op == 2) {
                    r = a - b
                    escreva("Resultado: ", r)
                } senao se (op == 3) {
                    r = a * b
                    escreva("Resultado: ", r)
                } senao se (op == 4) {
                    se (b != 0) {
                        r = a / b
                        escreva("Resultado: ", r)
                    } senao {
                        escreva("Resultado: Erro: div por zero")
                    }
                }
            }
        }
    }
}
