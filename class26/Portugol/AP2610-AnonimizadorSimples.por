inclua biblioteca Texto --> tx
inclua biblioteca Tipos --> tp

programa {
    funcao cadeia primeiroCaractereUltimaPalavra(cadeia nome) {
        inteiro tam, i, pos
        cadeia c

        tam = tx.numero_caracteres(nome)
        pos = 0
        para (i = 0; i <= tam - 1; i = i + 1) {
            c = tp.caracter_para_cadeia(tx.obter_caracter(nome, i))
            se (c == " ") {
                pos = i + 1
            }
        }
        retorne tp.caracter_para_cadeia(tx.obter_caracter(nome, pos))
    }

    funcao inicio() {
        cadeia nome, anonimizado, primeiraInicial, ultimaInicial

        escreva("Nome completo: ")
        leia(nome)

        primeiraInicial = tp.caracter_para_cadeia(tx.obter_caracter(nome, 0))
        ultimaInicial = primeiroCaractereUltimaPalavra(nome)
        anonimizado = primeiraInicial + "*** " + ultimaInicial + "***"

        escreva("Nome original: ", nome)
        escreva("Nome anonimizado: ", anonimizado)
        escreva("Dados anonimizados protegem a privacidade (LGPD).")
    }
}
