// ClassificacaoIdadeDETALHADA — Aula 15
// Classifica faixa etária com escolha/caso (simulado com se/senao se)
programa {
    funcao inicio() {
        inteiro idade
        escreva("Idade: ")
        leia(idade)
        se idade < 0 entao
            escreva("Idade inválida!")
        senao se idade <= 12 entao
            escreva("Criança")
        senao se idade <= 17 entao
            escreva("Adolescente")
        senao se idade <= 59 entao
            escreva("Adulto")
        senao se idade <= 120 entao
            escreva("Idoso")
        senao
            escreva("Idade improvável!")
        fimse
    }
}
