programa {
    funcao inicio() {
        real nota, freq
        escreva("Nota final: ")
        leia(nota)
        escreva("Frequência (%): ")
        leia(freq)
        se ((nota >= 70) e (freq >= 75)) {
            escreva("APROVADO!")
        } senao se ((nota >= 40) e (freq >= 75)) {
            escreva("RECUPERAÇÃO")
        } senao {
            escreva("REPROVADO")
        }
        escreva("Nota: ", nota, " | Frequência: ", freq, "%")
    }
}
