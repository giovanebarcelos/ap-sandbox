programa {
    funcao real imc(real peso, real altura) {
        retorne peso / (altura * altura)
    }

    funcao inicio() {
        real v
        v = imc(70, 1.75)
        escreva("IMC: ", v)
    }
}
