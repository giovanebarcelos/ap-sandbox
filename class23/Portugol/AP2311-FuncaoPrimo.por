programa {
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

    funcao inicio() {
        inteiro num
        escreva("Digite um número: ")
        leia(num)

        se ehPrimo(num) entao
            escreva(num, " é PRIMO!")
        senao
            escreva(num, " NÃO é primo.")
        fimse
    }
}
