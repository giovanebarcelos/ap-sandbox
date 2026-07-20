programa {
    funcao menu() {
        escreva("=== MENU PRINCIPAL ===")
        escreva("1 - Conversor Celsius -> Fahrenheit")
        escreva("2 - Calculadora de IMC")
        escreva("3 - Par ou Impar")
        escreva("4 - Maior de 3 numeros")
        escreva("5 - Sair")
    }

    funcao inicio() {
        inteiro opcao = 0
        real c, peso, altura, a, b, cc, maior
        inteiro n
        enquanto (opcao != 5) faca
            menu()
            escreva("Escolha uma opcao: ")
            leia(opcao)
            se (opcao == 1) entao
                escreva("Temperatura em Celsius: ")
                leia(c)
                escreva(c, "C = ", c * 9 / 5 + 32, "F")
            senao se (opcao == 2) entao
                escreva("Peso (kg): ")
                leia(peso)
                escreva("Altura (m): ")
                leia(altura)
                escreva("IMC: ", peso / (altura * altura))
            senao se (opcao == 3) entao
                escreva("Numero: ")
                leia(n)
                se (n % 2 == 0) entao
                    escreva("PAR")
                senao
                    escreva("IMPAR")
                fimse
            senao se (opcao == 4) entao
                escreva("a: ")
                leia(a)
                escreva("b: ")
                leia(b)
                escreva("c: ")
                leia(cc)
                maior = a
                se (b > maior) entao
                    maior = b
                fimse
                se (cc > maior) entao
                    maior = cc
                fimse
                escreva("Maior: ", maior)
            senao se (opcao == 5) entao
                escreva("Saindo...")
            senao
                escreva("Opcao invalida! Tente novamente.")
            fimse
        fimenquanto
    }
}
