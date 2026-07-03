#include <iostream>
#include <algorithm>
int maiorDeTres(int a,int b,int c){return std::max(a,std::max(b,c));}
int main(){std::cout<<"Maior: "<<maiorDeTres(12,45,23)<<"\n";return 0;}
