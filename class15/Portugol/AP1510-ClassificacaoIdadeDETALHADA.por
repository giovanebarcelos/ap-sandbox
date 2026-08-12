// ClassificacaoIdadeDETALHADA — Aula 15
// Classifica faixa etária com escolha/caso (simulado com se/senao se)
programa {
    funcao inicio() {
        inteiro idade
        escreva("Idade: ")
        leia(idade)
        se (idade < 0) {
            escreva("Idade inválida!")
        } senao se (idade <= 12) {
            escreva("Criança")
        } senao se (idade <= 17) {
            escreva("Adolescente")
        } senao se (idade <= 59) {
            escreva("Adulto")
        } senao se (idade <= 120) {
            escreva("Idoso")
        } senao {
            escreva("Idade improvável!")
        }
    }
}
