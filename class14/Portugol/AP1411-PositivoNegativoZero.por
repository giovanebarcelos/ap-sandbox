// PositivoNegativoZero — Aula 14
// Classifica um número como positivo, negativo ou zero
programa {
    funcao inicio() {
        real num
        escreva("Digite um número: ")
        leia(num)
        se num > 0 entao
            escreva(num, " é POSITIVO")
        senao se num < 0 entao
            escreva(num, " é NEGATIVO")
        senao
            escreva("O número é ZERO")
        fimse
    }
}
