inclua biblioteca Texto --> tx

programa {
    // Portugol nao tem biblioteca de hash, mas a validacao de entrada
    // continua funcionando normalmente com se/senao.
    funcao logico validarCadastro(cadeia nome, cadeia senha) {
        se (nome == "") {
            escreva("Erro: nome invalido\n")
            retorne falso
        }
        se (tx.numero_caracteres(senha) < 8) {
            escreva("Erro: senha deve ter 8+ caracteres\n")
            retorne falso
        }
        retorne verdadeiro
    }

    funcao inicio() {
        se (validarCadastro("Ana", "senhaForte123")) {
            escreva("Cadastro valido\n")
        }
        validarCadastro("", "123")
    }
}
