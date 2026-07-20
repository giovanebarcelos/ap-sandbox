// CalculadoraJurosSimples — Aula 13
// Calcula juros simples: J = C * i * t
programa {
    funcao inicio() {
        real capital
        real taxa
        inteiro tempo
        escreva("Capital inicial: R$ ")
        leia(capital)
        escreva("Taxa de juros mensal (%): ")
        leia(taxa)
        escreva("Tempo (meses): ")
        leia(tempo)
        real juros = capital * (taxa / 100) * tempo
        real montante = capital + juros
        escreva("Juros: R$ ", juros)
        escreva("Montante final: R$ ", montante)
    }
}
