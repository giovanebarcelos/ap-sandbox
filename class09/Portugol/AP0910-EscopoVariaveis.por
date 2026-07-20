// EscopoVariaveis - Aula 09
// Demonstra escopo local vs global
programa {
    funcao real calcularArea(real raio) {
        const real PI = 3.14159   // usada localmente dentro da funcao
        real area = PI * raio * raio   // area e variavel local
        retorne area
    }

    funcao inicio() {
        const real PI = 3.14159   // constante por convencao
        real raio, resultado
        escreva("Constante PI = ", PI, " (acessível em todo o programa)")
        escreva("Digite o raio: ")
        leia(raio)
        resultado = calcularArea(raio)
        escreva("Área do círculo: ", resultado)
    }
}
