// Conversao de tipos (casting)
inclua biblioteca Tipos --> tp

programa {
    funcao inicio() {
        cadeia texto = "42"
        inteiro numero = tp.cadeia_para_inteiro(texto, 10)   // cadeia -> inteiro
        escreva(numero + 8)                            // 50

        real valorReal = tp.cadeia_para_real("3.14")       // cadeia -> real
        escreva(valorReal * 2)                          // 6.28

        inteiro valorInt = tp.real_para_inteiro(9.99)      // real -> inteiro (trunca)
        escreva(valorInt)                               // 9

        escreva("Ano: ", 2026)                          // inteiro -> cadeia (concatenacao)
    }
}
