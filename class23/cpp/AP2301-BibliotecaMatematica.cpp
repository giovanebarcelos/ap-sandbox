#include <iostream>

long fatorial(int n) {
    long r = 1;
    for (int i = 2; i <= n; i++) r *= i;
    return r;
}

bool ehPrimo(int n) {
    if (n < 2) return false;
    for (int i = 2; i * i <= n; i++)
        if (n % i == 0) return false;
    return true;
}

int mdc(int a, int b) {
    while (b != 0) {
        int t = b;
        b = a % b;
        a = t;
    }
    return a;
}

int main() {
    std::cout << "5! = " << fatorial(5) << std::endl;          // 120
    std::cout << "7 e primo? " << (ehPrimo(7) ? "sim" : "nao") << std::endl;
    std::cout << "mdc(12, 18) = " << mdc(12, 18) << std::endl; // 6
    return 0;
}
