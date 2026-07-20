// PrecedenciaOperadores — Aula 12
// Demonstra a precedência de operadores aritméticos, relacionais e lógicos
programa {
    funcao inicio() {
        inteiro a = 10
        inteiro b = 5
        inteiro c = 2
        escreva("a=", a, ", b=", b, ", c=", c)
        escreva("a + b * c = ", a + b * c, "   (multiplicação antes da soma)")
        escreva("(a + b) * c = ", (a + b) * c, " (parênteses alteram a ordem)")
        escreva("a > b e b > c = ", a > b e b > c, " (relacionais antes do lógico)")
        escreva("nao (a < b) ou c > 0 = ", nao (a < b) ou c > 0, " (NOT antes do OR)")
    }
}
