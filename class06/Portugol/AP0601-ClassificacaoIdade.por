programa {
    funcao inicio() {
        inteiro idade
        escreva("Idade: ")
        leia(idade)

        se (idade < 12) {
            escreva("Crianca")
        } senao se (idade < 18) {
            escreva("Adolescente")
        } senao se (idade < 60) {
            escreva("Adulto")
        } senao {
            escreva("Idoso")
        }
    }
}
