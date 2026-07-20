// BoasPraticasNomes - Aula 09
// Demonstra boas praticas de nomenclatura de variaveis
programa {
    funcao inicio() {
        // Nomes significativos revelam a intencao
        real salarioBruto = 5000.00
        real descontoInss = salarioBruto * 0.11
        real descontoIr = salarioBruto * 0.075
        real salarioLiquido = salarioBruto - descontoInss - descontoIr
        escreva("Salário Bruto: R$ ", salarioBruto)
        escreva("Desconto INSS: R$ ", descontoInss)
        escreva("Desconto IR:   R$ ", descontoIr)
        escreva("Salário Líquido: R$ ", salarioLiquido)
    }
}
