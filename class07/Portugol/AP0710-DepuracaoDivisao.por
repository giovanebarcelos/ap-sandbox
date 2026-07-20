// DepuracaoDivisao - Aula 07
// Programa com bug proposital: divisao por zero
programa {
    funcao inicio() {
        real a, b
        escreva("Numerador: ")
        leia(a)
        escreva("Denominador: ")
        leia(b)
        // BUG CORRIGIDO: verificacao antes da divisao
        se b == 0 entao
            escreva("Erro: divisão por zero!")
        senao
            escreva("Resultado: ", a / b)
        fimse
    }
}
