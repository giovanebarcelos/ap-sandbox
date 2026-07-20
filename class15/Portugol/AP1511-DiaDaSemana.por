// DiaDaSemana — Aula 15
// Retorna o nome do dia da semana (simula escolha/caso com se/senao se)
programa {
    funcao inicio() {
        inteiro dia
        escreva("Digite um número (1-7): ")
        leia(dia)
        se dia == 1 entao
            escreva("Domingo")
        senao se dia == 2 entao
            escreva("Segunda-feira")
        senao se dia == 3 entao
            escreva("Terça-feira")
        senao se dia == 4 entao
            escreva("Quarta-feira")
        senao se dia == 5 entao
            escreva("Quinta-feira")
        senao se dia == 6 entao
            escreva("Sexta-feira")
        senao se dia == 7 entao
            escreva("Sábado")
        senao
            escreva("Número inválido! Digite 1-7.")
        fimse
    }
}
