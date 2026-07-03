#include <iostream>
int main() {
    int m[2][3] = {{1, 2, 3},
                   {4, 5, 6}};
    std::cout << "m[0][2] = " << m[0][2] << std::endl;   // 3
    std::cout << "m[1][0] = " << m[1][0] << std::endl;   // 4
    std::cout << "Matriz completa:" << std::endl;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) std::cout << m[i][j] << " ";
        std::cout << std::endl;
    }
    return 0;
}
