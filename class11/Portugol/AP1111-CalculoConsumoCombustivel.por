// CalculoConsumoCombustivel — Aula 11
// Calcula consumo medio de combustivel
programa {
    funcao inicio() {
        real km
        real litros
        escreva("Distância percorrida (km): ")
        leia(km)
        escreva("Combustível gasto (L): ")
        leia(litros)
        real consumo = km / litros
        escreva("Consumo médio: ", consumo, " km/L")
    }
}
