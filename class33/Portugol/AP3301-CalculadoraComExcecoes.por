programa {
    // Portugol nao tem try/catch: a tecnica disponivel e checar
    // a condicao perigosa ANTES de executar a operacao de risco.
    funcao real dividir(real a, real b) {
        se (b == 0) {
            escreva("Erro: divisao por zero\n")
            retorne 0.0
        }
        retorne a / b
    }

    funcao logico depositar(real valor) {
        se (valor <= 0) {
            escreva("Erro: valor deve ser positivo\n")
            retorne falso
        }
        escreva("Deposito de ", valor, " realizado\n")
        retorne verdadeiro
    }

    funcao inicio() {
        escreva("Resultado: ", dividir(10.0, 0.0), "\n")
        depositar(-50.0)
        escreva("Programa continuou rodando normalmente\n")
    }
}
