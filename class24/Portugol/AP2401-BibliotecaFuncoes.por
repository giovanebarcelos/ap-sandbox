programa {
    funcao logico ehPar(inteiro n) {
        retorne n % 2 == 0
    }

    funcao real imc(real peso, real altura) {
        retorne peso / (altura * altura)
    }

    funcao cadeia classificaImc(real valor) {
        se (valor < 18.5) {
            retorne "Abaixo do peso"
        }
        se (valor < 25) {
            retorne "Peso normal"
        }
        se (valor < 30) {
            retorne "Sobrepeso"
        }
        retorne "Obesidade"
    }

    funcao inicio() {
        real valor
        escreva("10 e par? ", ehPar(10))
        valor = imc(70, 1.75)
        escreva("IMC: ", valor, " - ", classificaImc(valor))
    }
}
