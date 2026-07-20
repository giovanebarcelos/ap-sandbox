programa {
    funcao inicio() {
        cadeia energiaDesligada

        escreva("Passo 1: Pegar uma lâmpada nova.")
        escreva("Passo 2: Subir na escada com cuidado.")
        escreva("A energia está desligada? (s/n): ")
        leia(energiaDesligada)

        se (energiaDesligada == "s") ou (energiaDesligada == "S") entao
            escreva("Passo 3: Retirar lâmpada queimada.")
            escreva("Passo 4: Rosquear lâmpada nova.")
            escreva("Passo 5: Ligar interruptor para testar.")
        senao
            escreva("Desligue a energia primeiro!")
        fimse
    }
}
