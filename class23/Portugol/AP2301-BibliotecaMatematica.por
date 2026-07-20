programa {
    funcao inteiro fatorial(inteiro n) {
        inteiro resultado, i
        resultado = 1
        para i de 2 ate n passo 1 faca
            resultado = resultado * i
        fimpara
        retorne resultado
    }

    funcao logico ehPrimo(inteiro n) {
        inteiro i
        se n < 2 entao
            retorne falso
        fimse
        para i de 2 ate real_para_inteiro(raiz(n)) passo 1 faca
            se n % i == 0 entao
                retorne falso
            fimse
        fimpara
        retorne verdadeiro
    }

    funcao inteiro mdc(inteiro a, inteiro b) {
        inteiro t
        enquanto b != 0 faca
            t = b
            b = a % b
            a = t
        fimenquanto
        retorne a
    }

    funcao inicio() {
        escreva("5! = ", fatorial(5))
        escreva("7 e primo? ", ehPrimo(7))
        escreva("mdc(12, 18) = ", mdc(12, 18))
    }
}
