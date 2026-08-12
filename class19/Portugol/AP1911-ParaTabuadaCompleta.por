programa {
    funcao inicio() {
        inteiro i, j
        para (i = 1; i <= 10; i++) {
            escreva("Tabuada do ", i, ":")
            para (j = 1; j <= 10; j++) {
                escreva("  ", i, " × ", j, " = ", i * j)
            }
            escreva("")
        }
    }
}
