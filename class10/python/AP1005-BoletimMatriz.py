# Boletim: matriz alunos x bimestres, media por aluno (loops aninhados)
ALUNOS, BIM = 3, 4
notas = [[7.5, 8.0, 6.5, 9.0],
         [5.0, 6.0, 7.0, 8.5],
         [9.0, 9.5, 8.0, 7.5]]
for i in range(ALUNOS):
    soma = 0.0
    for j in range(BIM):
        soma += notas[i][j]
    media = soma / BIM
    print(f"Media do aluno {i}: {media:.2f}")
