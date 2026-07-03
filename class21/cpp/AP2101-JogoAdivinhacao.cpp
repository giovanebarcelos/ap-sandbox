#include <iostream>
#include <cstdlib>
#include <ctime>
int main() {
    srand(time(0));
    int s = rand() % 100 + 1, p, t = 0;
    while (true) {
        std::cout << "Palpite: "; std::cin >> p; t++;
        if (p < s) std::cout << "MAIOR" << std::endl;
        else if (p > s) std::cout << "MENOR" << std::endl;
        else { std::cout << "ACERTOU em " << t << " tentativas!" << std::endl; break; }
    }
    return 0;
}
