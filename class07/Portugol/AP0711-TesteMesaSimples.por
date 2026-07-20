// TesteMesaSimples - Aula 07
// Algoritmo para praticar teste de mesa
programa {
    funcao inicio() {
        inteiro x = 5
        inteiro y = 10
        escreva("Antes: x=", x, ", y=", y)
        x = x + y
        y = x - y
        x = x - y
        escreva("Depois da troca: x=", x, ", y=", y)
        escreva("Os valores foram trocados sem variável extra!")
    }
}
