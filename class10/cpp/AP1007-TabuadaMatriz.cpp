#include <iostream>
#include <iomanip>
int main() {
    const int N = 10;
    int m[N][N];
    for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++)
            m[i][j] = (i + 1) * (j + 1);
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) std::cout << std::setw(4) << m[i][j];
        std::cout << std::endl;
    }
    return 0;
}
