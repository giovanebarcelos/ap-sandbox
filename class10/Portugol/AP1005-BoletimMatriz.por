// Boletim: matriz alunos x bimestres, media por aluno (loops aninhados)
programa {
    funcao inicio() {
        const inteiro ALUNOS = 3
        const inteiro BIM = 4
        real notas[3][4] = {
            {7.5, 8.0, 6.5, 9.0},
            {5.0, 6.0, 7.0, 8.5},
            {9.0, 9.5, 8.0, 7.5}
        }
        inteiro i, j
        para i de 0 ate ALUNOS - 1 faca
            real soma = 0.0
            para j de 0 ate BIM - 1 faca
                soma = soma + notas[i][j]
            fimpara
            escreva("Media do aluno ", i, ": ", soma / BIM)
        fimpara
    }
}
