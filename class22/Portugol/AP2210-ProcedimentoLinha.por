programa {
    funcao linha(cadeia caractere, inteiro tamanho) {
        inteiro i
        cadeia saida
        saida = ""
        para i de 1 ate tamanho faca
            saida = saida + caractere
        fimpara
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
