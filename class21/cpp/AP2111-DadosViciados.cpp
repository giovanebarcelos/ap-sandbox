#include <iostream>
#include <cstdlib>
#include <ctime>
#include <iomanip>
int main() {
    srand(time(0));
    int n, freq[7] = {0};
    std::cout << "Quantos lançamentos? "; std::cin >> n;
    for (int i = 0; i < n; i++)
        freq[rand()%6+1]++;
    std::cout << "\nResultados:" << std::endl;
    for (int face = 1; face <= 6; face++)
        std::cout << "Face " << face << ": " << freq[face] << " vezes (" << std::fixed << std::setprecision(1) << freq[face]*100.0/n << "%)" << std::endl;
    return 0;
}