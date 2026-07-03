public class BoletimMatriz {
    public static void main(String[] args) {
        final int ALUNOS = 3, BIM = 4;
        double[][] notas = {
            {7.5, 8.0, 6.5, 9.0},
            {5.0, 6.0, 7.0, 8.5},
            {9.0, 9.5, 8.0, 7.5}
        };
        for (int i = 0; i < ALUNOS; i++) {
            double soma = 0;
            for (int j = 0; j < BIM; j++) soma += notas[i][j];
            System.out.printf("Media do aluno %d: %.2f%n", i, soma / BIM);
        }
    }
}
