// Calculo de salario liquido (estrutura sequencial)
programa {
    funcao inicio() {
        real bruto
        escreva("Salario bruto: ")
        leia(bruto)
        real inss = bruto * 0.11
        real ir = bruto * 0.075
        real liquido = bruto - inss - ir
        escreva("INSS (11%): ", inss)
        escreva("IR (7,5%): ", ir)
        escreva("Salario liquido: ", liquido)
    }
}
