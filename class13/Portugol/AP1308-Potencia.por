programa {
    funcao inicio() {
        inteiro base = 2
        inteiro expoente = 10
        inteiro r = 1
        para (inteiro i = 0; i <= expoente - 1; i++) {
            r = r * base
        }
        escreva(base, "^", expoente, " = ", r)
    }
}
