#include <iostream>
#include <iomanip>
int main() {
    const int ALUNOS = 3, BIM = 4;
    double notas[ALUNOS][BIM] = {
        {7.5, 8.0, 6.5, 9.0},
        {5.0, 6.0, 7.0, 8.5},
        {9.0, 9.5, 8.0, 7.5}
    };
    std::cout << std::fixed << std::setprecision(2);
    for (int i = 0; i < ALUNOS; i++) {
        double soma = 0;
        for (int j = 0; j < BIM; j++) soma += notas[i][j];
        std::cout << "Media do aluno " << i << ": " << soma / BIM << std::endl;
    }
    return 0;
}
