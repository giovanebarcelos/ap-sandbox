programa {
    funcao exibirMenu() {
        escreva("1 - Sacar")
        escreva("2 - Depositar")
        escreva("3 - Sair")
    }

    funcao inteiro dobro(inteiro n) {
        retorne n * 2
    }

    funcao inicio() {
        exibirMenu()
        escreva("Dobro de 5 = ", dobro(5))
    }
}
