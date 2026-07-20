programa {
    funcao inicio() {
        inteiro op = 0
        real a
        real b
        real r
        logico continuar = verdadeiro
        enquanto continuar faca
            escreva("1-Somar 2-Subtrair 3-Mult 4-Div 5-Sair")
            escreva("Opção: ")
            leia(op)
            se op == 5 entao
                continuar = falso
            senao se (op >= 1) e (op <= 4) entao
                escreva("N1: ")
                leia(a)
                escreva("N2: ")
                leia(b)
                se op == 1 entao
                    r = a + b
                    escreva("Resultado: ", r)
                senao se op == 2 entao
                    r = a - b
                    escreva("Resultado: ", r)
                senao se op == 3 entao
                    r = a * b
                    escreva("Resultado: ", r)
                senao se op == 4 entao
                    se b != 0 entao
                        r = a / b
                        escreva("Resultado: ", r)
                    senao
                        escreva("Resultado: Erro: div por zero")
                    fimse
                fimse
            fimse
        fimenquanto
    }
}
