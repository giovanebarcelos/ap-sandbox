// CastingTipos - Aula 08
// Demonstra conversao explicita entre tipos (casting)
programa {
    funcao inicio() {
        real valor = 9.75
        inteiro valorInt = real_para_inteiro(valor)
        escreva("Valor original (real): ", valor)
        escreva("Após casting para inteiro: ", valorInt)
        escreva("Diferença: ", (valor - valorInt), " (parte decimal perdida)")
    }
}
