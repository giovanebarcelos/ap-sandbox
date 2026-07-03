#include <iostream>
int main() {
    const int LIN = 2, COL = 3;
    int a[LIN][COL] = {{1, 2, 3}, {4, 5, 6}};
    int b[LIN][COL] = {{10, 20, 30}, {40, 50, 60}};
    int c[LIN][COL];
    for (int i = 0; i < LIN; i++)
        for (int j = 0; j < COL; j++)
            c[i][j] = a[i][j] + b[i][j];
    std::cout << "Matriz soma:" << std::endl;
    for (int i = 0; i < LIN; i++) {
        for (int j = 0; j < COL; j++) std::cout << c[i][j] << " ";
        std::cout << std::endl;
    }
    return 0;
}
