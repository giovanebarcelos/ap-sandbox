programa {
    funcao inicio() {
        real nota1, nota2, media

        escreva("Digite a primeira nota: ")
        leia(nota1)
        escreva("Digite a segunda nota: ")
        leia(nota2)

        media = (nota1 + nota2) / 2
        escreva("Media: ", media)

        se media >= 7 entao
            escreva("Aprovado")
        senao
            escreva("Reprovado")
        fimse
    }
}
