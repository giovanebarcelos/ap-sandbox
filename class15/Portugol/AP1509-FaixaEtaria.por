programa {
    funcao inicio() {
        inteiro idade = 30
        cadeia f
        se idade < 12 entao
            f = "Crianca"
        senao se idade < 18 entao
            f = "Adolescente"
        senao se idade < 60 entao
            f = "Adulto"
        senao
            f = "Idoso"
        fimse
        escreva(f)
    }
}
