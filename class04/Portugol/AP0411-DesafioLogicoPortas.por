programa {
    funcao inicio() {
        cadeia sa, sb
        logico a, b, xor

        escreva("Circuito XOR usando portas básicas:")
        escreva("XOR = (A OR B) AND NOT (A AND B)")
        escreva("A (true/false): ")
        leia(sa)
        escreva("B (true/false): ")
        leia(sb)

        a = sa == "true"
        b = sb == "true"
        xor = (a ou b) e (nao (a e b))

        escreva("A XOR B = ", xor)
    }
}
