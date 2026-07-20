// ConverteTemperatura — Aula 06
// Converte Celsius para Fahrenheit
programa {
    funcao inicio() {
        real c, f
        escreva("Temperatura em °C: ")
        leia(c)
        f = (c * 9 / 5) + 32
        escreva(c, "°C = ", f, "°F")
    }
}
