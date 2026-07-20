programa {
    funcao logico ehPar(inteiro n) {
        retorne n % 2 == 0
    }

    funcao real imc(real peso, real altura) {
        retorne peso / (altura * altura)
    }

    funcao cadeia classificaImc(real valor) {
        se valor < 18.5 entao
            retorne "Abaixo do peso"
        fimse
        se valor < 25 entao
            retorne "Peso normal"
        fimse
        se valor < 30 entao
            retorne "Sobrepeso"
        fimse
        retorne "Obesidade"
    }

    funcao inicio() {
        real valor
        escreva("10 e par? ", ehPar(10))
        valor = imc(70, 1.75)
        escreva("IMC: ", valor, " - ", classificaImc(valor))
    }
}
