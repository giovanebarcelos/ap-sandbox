inclua biblioteca Texto --> tx
inclua biblioteca Tipos --> tp

programa {
    funcao logico validarEmail(cadeia email) {
        inteiro tam, i, arroba
        logico temPonto
        cadeia c

        tam = tx.numero_caracteres(email)
        arroba = -1
        para (i = 0; i <= tam - 1; i = i + 1) {
            c = tp.caracter_para_cadeia(tx.obter_caracter(email, i))
            se (c == "@") {
                se (arroba == -1) {
                    arroba = i
                }
            }
        }

        se (arroba == -1) {
            retorne falso
        }

        temPonto = falso
        para (i = arroba + 1; i <= tam - 1; i = i + 1) {
            c = tp.caracter_para_cadeia(tx.obter_caracter(email, i))
            se (c == ".") {
                temPonto = verdadeiro
            }
        }

        retorne temPonto
    }

    funcao inicio() {
        cadeia email
        escreva("Digite seu email: ")
        leia(email)

        se (validarEmail(email)) {
            escreva("Email ", email, " eh VALIDO!")
        } senao {
            escreva("Email ", email, " eh INVALIDO!")
        }
    }
}
