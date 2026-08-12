// DiaDaSemana — Aula 15
// Retorna o nome do dia da semana (simula escolha/caso com se/senao se)
programa {
    funcao inicio() {
        inteiro dia
        escreva("Digite um número (1-7): ")
        leia(dia)
        se (dia == 1) {
            escreva("Domingo")
        } senao se (dia == 2) {
            escreva("Segunda-feira")
        } senao se (dia == 3) {
            escreva("Terça-feira")
        } senao se (dia == 4) {
            escreva("Quarta-feira")
        } senao se (dia == 5) {
            escreva("Quinta-feira")
        } senao se (dia == 6) {
            escreva("Sexta-feira")
        } senao se (dia == 7) {
            escreva("Sábado")
        } senao {
            escreva("Número inválido! Digite 1-7.")
        }
    }
}
