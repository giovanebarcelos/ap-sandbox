#include <iostream>
#include <cstdlib>
#include <ctime>
int main(){srand(time(0));int secreto=rand()%100+1;std::cout<<"Numero secreto: "<<secreto<<"\n";return 0;}
