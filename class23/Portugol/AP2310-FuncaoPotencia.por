inclua biblioteca Matematica --> mat

programa {
    funcao real potencia(real base, inteiro expoente) {
        inteiro i
        real resultado

        se (expoente == 0) {
            retorne 1
        }

        resultado = 1
        para (i = 1; i <= mat.valor_absoluto(expoente); i = i + 1) {
            resultado = resultado * base
        }

        se (expoente < 0) {
            retorne 1 / resultado
        }
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
