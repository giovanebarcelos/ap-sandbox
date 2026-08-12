programa {
    funcao inicio() {
        real saldo, saque

        escreva("Saldo: R$ ")
        leia(saldo)
        escreva("Saque: R$ ")
        leia(saque)

        se (saque > saldo) {
            escreva("Saldo insuficiente")
        } senao se (saque % 10 != 0) {
            escreva("Use múltiplos de R$10")
        } senao {
            saldo = saldo - saque
            escreva("Saque liberado! Saldo: R$ ", saldo)
        }
    }
}
