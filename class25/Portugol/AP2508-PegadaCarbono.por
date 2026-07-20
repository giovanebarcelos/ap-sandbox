programa {
    funcao inicio() {
        real kmCarro, kwh, co2

        kmCarro = 300
        kwh = 200
        co2 = kmCarro * 0.12 + kwh * 0.09

        escreva("Pegada estimada: ", co2, " kg CO2/mes")
    }
}
