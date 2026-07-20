programa {
    funcao inicio() {
        inteiro lancamentos, i, face
        inteiro freq[7] = {0, 0, 0, 0, 0, 0, 0}
        real pct

        escreva("Quantos lançamentos? ")
        leia(lancamentos)

        para i de 1 ate lancamentos passo 1 faca
            face = sorteia(1, 6)
            freq[face] = freq[face] + 1
        fimpara

        escreva("")
        escreva("Resultados:")
        para face de 1 ate 6 faca
            pct = freq[face] / lancamentos * 100
            escreva("Face ", face, ": ", freq[face], " vezes (", pct, "%)")
        fimpara
    }
}
