programa {
    funcao real potencia(real base, inteiro expoente) {
        inteiro i
        real resultado

        se expoente == 0 entao
            retorne 1
        fimse

        resultado = 1
        para i de 1 ate abs(expoente) passo 1 faca
            resultado = resultado * base
        fimpara

        se expoente < 0 entao
            retorne 1 / resultado
        fimse
        retorne resultado
    }

    funcao inicio() {
        real b, resultado
        inteiro exp

        escreva("Base: ")
        leia(b)
        escreva("Expoente: ")
        leia(exp)

        resultado = potencia(b, exp)
        escreva(b, "^", exp, " = ", resultado)
    }
}
