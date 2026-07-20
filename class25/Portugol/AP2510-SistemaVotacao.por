programa {
    funcao inicio() {
        inteiro voto
        inteiro votos[4] = {0, 0, 0, 0}
        logico continuar

        continuar = verdadeiro

        escreva("=== VOTAÇÃO ===")
        escreva("1 - Candidato A")
        escreva("2 - Candidato B")
        escreva("3 - Candidato C")
        escreva("0 - Sair")

        enquanto continuar faca
            escreva("Seu voto: ")
            leia(voto)
            se voto == 0 entao
                continuar = falso
            senao se voto >= 1 e voto <= 3 entao
                votos[voto - 1] = votos[voto - 1] + 1
            senao
                votos[3] = votos[3] + 1
            fimse
        fimenquanto

        escreva("")
        escreva("Resultado:")
        escreva("  Candidato A: ", votos[0], " votos")
        escreva("  Candidato B: ", votos[1], " votos")
        escreva("  Candidato C: ", votos[2], " votos")
        escreva("  Nulos: ", votos[3])
    }
}
