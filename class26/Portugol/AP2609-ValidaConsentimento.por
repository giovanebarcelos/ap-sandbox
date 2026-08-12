programa {
    funcao inicio() {
        logico consentimento
        consentimento = verdadeiro

        se (consentimento) {
            escreva("Dados processados conforme a LGPD.")
        } senao {
            escreva("Processamento negado: sem consentimento.")
        }
    }
}
