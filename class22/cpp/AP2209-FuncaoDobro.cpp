#include <iostream>
int dobro(int n){return n*2;}
int main(){std::cout<<"dobro(7) = "<<dobro(7)<<"\n";std::cout<<"dobro(dobro(3)) = "<<dobro(dobro(3))<<"\n";return 0;}
