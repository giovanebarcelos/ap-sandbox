programa {
    funcao inicio() {
        cadeia cpf, meio, mascarado

        cpf = "123.456.789-00"
        meio = cpf[4] + cpf[5] + cpf[6]
        mascarado = "***." + meio + ".***-**"

        escreva("CPF anonimizado: ", mascarado)
    }
}
