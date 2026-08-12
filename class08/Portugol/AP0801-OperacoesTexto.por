// Operacoes basicas com texto (cadeia de caracteres)
inclua biblioteca Texto --> tx
inclua biblioteca Tipos --> tp

programa {
    funcao inicio() {
        cadeia nome
        escreva("Digite seu nome: ")
        leia(nome)
        escreva("Ola, ", nome, "!")
        escreva("Seu nome tem ", tx.numero_caracteres(nome), " caracteres")
        escreva("Primeira letra: ", tp.caracter_para_cadeia(tx.obter_caracter(nome, 0)))
    }
}
