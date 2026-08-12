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
        enquanto (opcao != 5) {
            menu()
            escreva("Escolha uma opcao: ")
            leia(opcao)
            se (opcao == 1) {
                escreva("Temperatura em Celsius: ")
                leia(c)
                escreva(c, "C = ", c * 9 / 5 + 32, "F")
            } senao se (opcao == 2) {
                escreva("Peso (kg): ")
                leia(peso)
                escreva("Altura (m): ")
                leia(altura)
                escreva("IMC: ", peso / (altura * altura))
            } senao se (opcao == 3) {
                escreva("Numero: ")
                leia(n)
                se (n % 2 == 0) {
                    escreva("PAR")
                } senao {
                    escreva("IMPAR")
                }
            } senao se (opcao == 4) {
                escreva("a: ")
                leia(a)
                escreva("b: ")
                leia(b)
                escreva("c: ")
                leia(cc)
                maior = a
                se (b > maior) {
                    maior = b
                }
                se (cc > maior) {
                    maior = cc
                }
                escreva("Maior: ", maior)
            } senao se (opcao == 5) {
                escreva("Saindo...")
            } senao {
                escreva("Opcao invalida! Tente novamente.")
            }
        }
    }
}
