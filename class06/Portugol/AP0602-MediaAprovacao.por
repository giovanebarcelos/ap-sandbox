// Media de duas notas e situacao do aluno
programa {
    funcao inicio() {
        real n1, n2, media
        escreva("Nota 1: ")
        leia(n1)
        escreva("Nota 2: ")
        leia(n2)
        media = (n1 + n2) / 2
        escreva("Media: ", media)

        se media >= 7 entao
            escreva("APROVADO")
        senao se media >= 5 entao
            escreva("RECUPERACAO")
        senao
            escreva("REPROVADO")
        fimse
    }
}
