programa {
    funcao cadeia repetir(cadeia c, inteiro n) {
        inteiro i
        cadeia s
        s = ""
        para (i = 1; i <= n; i = i + 1) {
            s = s + c
        }
        retorne s
    }

    funcao inicio() {
        cadeia barra
        barra = repetir("=", 40)
        escreva(barra)
        escreva("PARABENS! Você concluiu o curso de")
        escreva("Algoritmos e Programação")
        escreva(barra)
    }
}
