// CalculadoraIMC — Aula 13
// Calculadora de IMC com classificação
programa {
    funcao inicio() {
        real peso
        real altura
        escreva("Peso (kg): ")
        leia(peso)
        escreva("Altura (m): ")
        leia(altura)
        real imc = peso / (altura * altura)
        escreva("IMC: ", imc)
        se imc < 18.5 entao
            escreva("Classificação: Abaixo do peso")
        senao se imc < 25 entao
            escreva("Classificação: Peso normal")
        senao se imc < 30 entao
            escreva("Classificação: Sobrepeso")
        senao
            escreva("Classificação: Obesidade")
        fimse
    }
}
