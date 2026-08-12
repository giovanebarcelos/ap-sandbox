inclua biblioteca Util --> u

programa {
    funcao inicio() {
        inteiro jogador, computador, soma

        escreva("=== PAR OU ÍMPAR ===")
        escreva("Escolha um número (0-10): ")
        leia(jogador)

        computador = u.sorteia(0, 10)
        soma = jogador + computador

        escreva("Você: ", jogador, " | Computador: ", computador, " | Soma: ", soma)

        se (soma % 2 == 0) {
            escreva("Soma PAR — Venceu quem escolheu PAR!")
        } senao {
            escreva("Soma ÍMPAR — Venceu quem escolheu ÍMPAR!")
        }
    }
}
