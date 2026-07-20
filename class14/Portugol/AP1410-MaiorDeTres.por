// MaiorDeTres — Aula 14
// Encontra o maior entre três números usando SE/SENAO
programa {
    funcao inicio() {
        real a
        real b
        real c
        real maior
        escreva("Número 1: ")
        leia(a)
        escreva("Número 2: ")
        leia(b)
        escreva("Número 3: ")
        leia(c)
        se (a >= b) e (a >= c) entao
            maior = a
        senao se b >= c entao
            maior = b
        senao
            maior = c
        fimse
        escreva("O maior número é ", maior)
    }
}
