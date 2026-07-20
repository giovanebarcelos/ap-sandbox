// CalculoSalarioLiquido — Aula 11
// Entrada -> Processamento -> Saida: salario com descontos
programa {
    funcao inicio() {
        real horas
        real valorHora
        escreva("Horas trabalhadas: ")
        leia(horas)
        escreva("Valor por hora: R$ ")
        leia(valorHora)
        real bruto = horas * valorHora
        real inss = bruto * 0.08
        real liquido = bruto - inss
        escreva("Salário Bruto:   R$ ", bruto)
        escreva("Desconto INSS:   R$ ", inss)
        escreva("Salário Líquido: R$ ", liquido)
    }
}
