inclua biblioteca Matematica --> mat
inclua biblioteca Tipos --> tp

programa {
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

    funcao inicio() {
        inteiro num
        escreva("Digite um número: ")
        leia(num)

        se (ehPrimo(num)) {
            escreva(num, " é PRIMO!")
        } senao {
            escreva(num, " NÃO é primo.")
        }
    }
}
