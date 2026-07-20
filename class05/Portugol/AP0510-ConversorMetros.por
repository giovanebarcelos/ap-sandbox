programa {
    funcao inicio() {
        real metros, cm, mm

        escreva("Digite o valor em metros: ")
        leia(metros)

        cm = metros * 100
        mm = metros * 1000

        escreva(metros, " m = ", cm, " cm = ", mm, " mm")
    }
}
