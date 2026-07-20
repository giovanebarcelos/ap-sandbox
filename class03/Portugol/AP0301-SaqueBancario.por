programa {
    funcao inicio() {
        real saldo, saque

        escreva("Saldo: R$ ")
        leia(saldo)
        escreva("Saque: R$ ")
        leia(saque)

        se saque > saldo entao
            escreva("Saldo insuficiente")
        senao se saque % 10 != 0 entao
            escreva("Use múltiplos de R$10")
        senao
            saldo = saldo - saque
            escreva("Saque liberado! Saldo: R$ ", saldo)
        fimse
    }
}
