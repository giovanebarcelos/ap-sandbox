programa {
    funcao inicio() {
        inteiro jogador, computador, soma

        escreva("=== PAR OU ÍMPAR ===")
        escreva("Escolha um número (0-10): ")
        leia(jogador)

        computador = sorteia(0, 10)
        soma = jogador + computador

        escreva("Você: ", jogador, " | Computador: ", computador, " | Soma: ", soma)

        se soma % 2 == 0 entao
            escreva("Soma PAR — Venceu quem escolheu PAR!")
        senao
            escreva("Soma ÍMPAR — Venceu quem escolheu ÍMPAR!")
        fimse
    }
}
