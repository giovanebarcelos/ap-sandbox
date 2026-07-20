programa {
    funcao inicio() {
        real a = 1
        real b = -5
        real c = 6
        real delta = b * b - 4 * a * c
        se delta >= 0 entao
            real x1 = (-b + raiz(delta)) / (2 * a)
            real x2 = (-b - raiz(delta)) / (2 * a)
            escreva("Raizes: ", x1, " e ", x2)
        senao
            escreva("Sem raizes reais")
        fimse
    }
}
