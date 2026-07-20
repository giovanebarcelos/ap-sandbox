programa {
    funcao inicio() {
        inteiro op
        real c, km, kg
        escreva("=== CONVERSOR ===")
        escreva("1 - °C → °F")
        escreva("2 - km → milhas")
        escreva("3 - kg → libras")
        escreva("Escolha: ")
        leia(op)
        se (op == 1) entao
            escreva("°C: ")
            leia(c)
            escreva(c, "°C = ", c * 9 / 5 + 32, "°F")
        senao se (op == 2) entao
            escreva("km: ")
            leia(km)
            escreva(km, " km = ", km * 0.6214, " milhas")
        senao se (op == 3) entao
            escreva("kg: ")
            leia(kg)
            escreva(kg, " kg = ", kg * 2.2046, " libras")
        senao
            escreva("Opção inválida!")
        fimse
    }
}
