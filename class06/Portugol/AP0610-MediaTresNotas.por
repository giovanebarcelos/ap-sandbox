// MediaTresNotas — Aula 06
// Calcula a media de 3 notas
programa {
    funcao inicio() {
        real n1, n2, n3, media
        escreva("Nota 1: ")
        leia(n1)
        escreva("Nota 2: ")
        leia(n2)
        escreva("Nota 3: ")
        leia(n3)
        media = (n1 + n2 + n3) / 3
        escreva("Média: ", media)
    }
}
