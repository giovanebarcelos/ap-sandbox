// Operacoes basicas com texto (cadeia de caracteres)
programa {
    funcao inicio() {
        cadeia nome
        escreva("Digite seu nome: ")
        leia(nome)
        escreva("Ola, ", nome, "!")
        escreva("Seu nome tem ", cadeia_tamanho(nome), " caracteres")
        escreva("Primeira letra: ", nome[0])
    }
}
