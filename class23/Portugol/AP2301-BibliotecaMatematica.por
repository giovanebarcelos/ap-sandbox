inclua biblioteca Matematica --> mat
inclua biblioteca Tipos --> tp

programa {
    funcao inteiro fatorial(inteiro n) {
        inteiro resultado, i
        resultado = 1
        para (i = 2; i <= n; i = i + 1) {
            resultado = resultado * i
        }
        retorne resultado
    }

    funcao logico ehPrimo(inteiro n) {
        inteiro i
        se (n < 2) {
            retorne falso
        }
        para (i = 2; i <= tp.real_para_inteiro(mat.raiz(n, 2.0)); i = i + 1) {
            se (n % i == 0) {
                retorne falso
            }
        }
        retorne verdadeiro
    }

    funcao inteiro mdc(inteiro a, inteiro b) {
        inteiro t
        enquanto (b != 0) {
            t = b
            b = a % b
            a = t
        }
        retorne a
    }

    funcao inicio() {
        escreva("5! = ", fatorial(5))
        escreva("7 e primo? ", ehPrimo(7))
        escreva("mdc(12, 18) = ", mdc(12, 18))
    }
}
