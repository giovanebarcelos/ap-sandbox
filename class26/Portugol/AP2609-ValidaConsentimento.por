programa {
    funcao inicio() {
        logico consentimento
        consentimento = verdadeiro

        se consentimento entao
            escreva("Dados processados conforme a LGPD.")
        senao
            escreva("Processamento negado: sem consentimento.")
        fimse
    }
}
