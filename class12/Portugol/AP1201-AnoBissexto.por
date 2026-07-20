// Verifica se um ano e bissexto
programa {
    funcao inicio() {
        inteiro ano
        escreva("Digite o ano: ")
        leia(ano)
        logico bissexto = (ano % 4 == 0 e ano % 100 != 0) ou (ano % 400 == 0)
        se bissexto entao
            escreva(ano, " E bissexto")
        senao
            escreva(ano, " NAO e bissexto")
        fimse
    }
}
