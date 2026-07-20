programa {
    funcao cadeia primeiroCaractereUltimaPalavra(cadeia nome) {
        inteiro tam, i, pos
        cadeia c

        tam = cadeia_tamanho(nome)
        pos = 0
        para i de 0 ate tam - 1 passo 1 faca
            c = nome[i]
            se c == " " entao
                pos = i + 1
            fimse
        fimpara
        retorne nome[pos]
    }

    funcao inicio() {
        cadeia nome, anonimizado, primeiraInicial, ultimaInicial

        escreva("Nome completo: ")
        leia(nome)

        primeiraInicial = nome[0]
        ultimaInicial = primeiroCaractereUltimaPalavra(nome)
        anonimizado = primeiraInicial + "*** " + ultimaInicial + "***"

        escreva("Nome original: ", nome)
        escreva("Nome anonimizado: ", anonimizado)
        escreva("Dados anonimizados protegem a privacidade (LGPD).")
    }
}
