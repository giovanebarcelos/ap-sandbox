inclua biblioteca Texto --> tx

programa {
    funcao logico senhaForte(cadeia senha) {
        retorne tx.numero_caracteres(senha) >= 8
    }

    funcao inicio() {
        escreva("12345678 forte? ", senhaForte("12345678"))
        escreva("123 forte? ", senhaForte("123"))
    }
}
