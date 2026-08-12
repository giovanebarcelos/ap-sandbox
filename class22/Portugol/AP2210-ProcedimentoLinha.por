programa {
    funcao linha(cadeia caractere, inteiro tamanho) {
        inteiro i
        cadeia saida
        saida = ""
        para (i = 1; i <= tamanho; i++) {
            saida = saida + caractere
        }
        escreva(saida)
    }

    funcao inicio() {
        linha("=", 30)
        escreva("  SISTEMA DE NOTAS  ")
        linha("-", 30)
        escreva("  Aluno: João Silva  ")
        escreva("  Nota: 8.5  ")
        linha("=", 30)
    }
}
