programa {
    funcao logico senhaForte(cadeia senha) {
        retorne cadeia_tamanho(senha) >= 8
    }

    funcao inicio() {
        escreva("12345678 forte? ", senhaForte("12345678"))
        escreva("123 forte? ", senhaForte("123"))
    }
}
