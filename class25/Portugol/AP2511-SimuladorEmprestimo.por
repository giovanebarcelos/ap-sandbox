programa {
    funcao inicio() {
        real valor, taxa, taxaDecimal, parcela, total
        inteiro meses

        escreva("Valor do empréstimo: R$ ")
        leia(valor)
        escreva("Taxa mensal (%): ")
        leia(taxa)
        escreva("Número de parcelas: ")
        leia(meses)

        taxaDecimal = taxa / 100
        parcela = valor * (taxaDecimal * potencia(1 + taxaDecimal, meses)) / (potencia(1 + taxaDecimal, meses) - 1)
        total = parcela * meses

        escreva("")
        escreva("Parcela mensal: R$ ", parcela)
        escreva("Total a pagar: R$ ", total)
        escreva("Juros totais:  R$ ", total - valor)
    }
}
