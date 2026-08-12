inclua biblioteca Util --> u

programa {
    funcao inicio() {
        inteiro lancamentos, i, face
        inteiro freq[7] = {0, 0, 0, 0, 0, 0, 0}
        real pct

        escreva("Quantos lançamentos? ")
        leia(lancamentos)

        para (i = 1; i <= lancamentos; i = i + 1) {
            face = u.sorteia(1, 6)
            freq[face] = freq[face] + 1
        }

        escreva("")
        escreva("Resultados:")
        para (face = 1; face <= 6; face++) {
            pct = freq[face] / lancamentos * 100
            escreva("Face ", face, ": ", freq[face], " vezes (", pct, "%)")
        }
    }
}
