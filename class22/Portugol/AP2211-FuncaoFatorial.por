programa {
    funcao inteiro fatorial(inteiro n) {
        inteiro resultado, i
        se n < 0 entao
            retorne -1
        fimse
        resultado = 1
        para i de 2 ate n passo 1 faca
            resultado = resultado * i
        fimpara
        retorne resultado
    }

    funcao inicio() {
        inteiro num, fat
        escreva("Digite um número: ")
        leia(num)
        fat = fatorial(num)
        se fat == -1 entao
            escreva("Não existe fatorial de número negativo!")
        senao
            escreva(num, "! = ", fat)
        fimse
    }
}
