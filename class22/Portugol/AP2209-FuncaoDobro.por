programa {
    funcao inteiro dobro(inteiro n) {
        retorne n * 2
    }

    funcao inicio() {
        escreva("dobro(7) = ", dobro(7))
        escreva("dobro(dobro(3)) = ", dobro(dobro(3)))
    }
}
