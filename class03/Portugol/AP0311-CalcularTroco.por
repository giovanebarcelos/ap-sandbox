programa {
    funcao inicio() {
        real valor, pago, troco

        escreva("Valor da compra: R$ ")
        leia(valor)
        escreva("Valor pago: R$ ")
        leia(pago)

        troco = pago - valor

        se troco < 0 entao
            escreva("Dinheiro insuficiente!")
        senao
            escreva("Troco: R$ ", troco)
        fimse
    }
}
