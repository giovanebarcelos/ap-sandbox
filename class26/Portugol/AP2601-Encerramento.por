programa {
    funcao cadeia repetir(cadeia c, inteiro n) {
        inteiro i
        cadeia s
        s = ""
        para i de 1 ate n passo 1 faca
            s = s + c
        fimpara
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
