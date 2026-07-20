// Conversao de tipos (casting)
programa {
    funcao inicio() {
        cadeia texto = "42"
        inteiro numero = cadeia_para_inteiro(texto)   // cadeia -> inteiro
        escreva(numero + 8)                            // 50

        real valorReal = cadeia_para_real("3.14")       // cadeia -> real
        escreva(valorReal * 2)                          // 6.28

        inteiro valorInt = real_para_inteiro(9.99)      // real -> inteiro (trunca)
        escreva(valorInt)                               // 9

        escreva("Ano: ", 2026)                          // inteiro -> cadeia (concatenacao)
    }
}
