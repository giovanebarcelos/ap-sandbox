programa {
    funcao inicio() {
        real capital, taxa, montante
        inteiro meses

        capital = 1000.0
        taxa = 0.01
        meses = 12

        montante = capital * potencia(1 + taxa, meses)
        escreva("Montante apos ", meses, " meses: ", montante)
    }
}
