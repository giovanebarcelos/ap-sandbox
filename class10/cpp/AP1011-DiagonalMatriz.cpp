#include <iostream>
int main() {
    int matriz[3][3] = {{5, 2, 8}, {3, 7, 1}, {9, 4, 6}};
    std::cout << "Matriz 3x3:" << std::endl;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++)
            std::cout << matriz[i][j] << "  ";
        std::cout << std::endl;
    }
    std::cout << "\nDiagonal principal:" << std::endl;
    for (int i = 0; i < 3; i++)
        std::cout << "  m[" << i << "][" << i << "] = " << matriz[i][i] << std::endl;
    return 0;
}