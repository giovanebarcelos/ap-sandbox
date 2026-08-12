inclua biblioteca Texto --> tx
inclua biblioteca Tipos --> tp

programa {
    funcao inicio() {
        cadeia cpf, meio, mascarado

        cpf = "123.456.789-00"
        meio = tp.caracter_para_cadeia(tx.obter_caracter(cpf, 4)) + tp.caracter_para_cadeia(tx.obter_caracter(cpf, 5)) + tp.caracter_para_cadeia(tx.obter_caracter(cpf, 6))
        mascarado = "***." + meio + ".***-**"

        escreva("CPF anonimizado: ", mascarado)
    }
}
