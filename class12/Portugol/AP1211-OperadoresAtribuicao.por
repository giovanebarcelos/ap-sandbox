// OperadoresAtribuicao — Aula 12
// Demonstra operadores de atribuição composta (+=, -=, *=, /=, %=)
programa {
    funcao inicio() {
        real x = 10
        escreva("Valor inicial: x = ", x)
        x = x + 5
        escreva("x += 5  -> x = ", x)
        x = x - 3
        escreva("x -= 3  -> x = ", x)
        x = x * 2
        escreva("x *= 2  -> x = ", x)
        x = x / 4
        escreva("x /= 4  -> x = ", x)
        x = real_para_inteiro(x)
        x = x % 3
        escreva("x %= 3  -> x = ", x)
    }
}
