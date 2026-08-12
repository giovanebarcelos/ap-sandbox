programa {
    funcao inteiro fatorial(inteiro n) {
        inteiro resultado, i
        se (n < 0) {
            retorne -1
        }
        resultado = 1
        para (i = 2; i <= n; i = i + 1) {
            resultado = resultado * i
        }
        retorne resultado
    }

    funcao inicio() {
        inteiro num, fat
        escreva("Digite um número: ")
        leia(num)
        fat = fatorial(num)
        se (fat == -1) {
            escreva("Não existe fatorial de número negativo!")
        } senao {
            escreva(num, "! = ", fat)
        }
    }
}
