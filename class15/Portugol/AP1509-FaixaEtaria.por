programa {
    funcao inicio() {
        inteiro idade = 30
        cadeia f
        se (idade < 12) {
            f = "Crianca"
        } senao se (idade < 18) {
            f = "Adolescente"
        } senao se (idade < 60) {
            f = "Adulto"
        } senao {
            f = "Idoso"
        }
        escreva(f)
    }
}
