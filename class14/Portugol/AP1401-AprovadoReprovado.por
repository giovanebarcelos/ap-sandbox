// Estrutura SE/SENAO: aprovado ou reprovado
programa {
    funcao inicio() {
        real media
        escreva("Digite a media do aluno: ")
        leia(media)
        se media >= 7 entao
            escreva("APROVADO")
        senao
            escreva("REPROVADO")
        fimse
    }
}
