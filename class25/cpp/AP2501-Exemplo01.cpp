#include <iostream>
int main() {
    int votos[4] = {0}, voto;
    std::cout << "=== VOTAÇÃO ===\n1 - Candidato A\n2 - Candidato B\n3 - Candidato C\n0 - Sair" << std::endl;
    while (true) {
        std::cout << "Seu voto: "; std::cin >> voto;
        if (voto == 0) break;
        if (voto >= 1 && voto <= 3) votos[voto-1]++;
        else votos[3]++;
    }
    std::cout << "\nResultado:" << std::endl;
    std::cout << "  Candidato A: " << votos[0] << " votos" << std::endl;
    std::cout << "  Candidato B: " << votos[1] << " votos" << std::endl;
    std::cout << "  Candidato C: " << votos[2] << " votos" << std::endl;
    std::cout << "  Nulos: " << votos[3] << std::endl;
    return 0;
}