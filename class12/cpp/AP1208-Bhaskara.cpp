#include <iostream>
#include <cmath>
int main(){double a=1,b=-5,c=6,delta=b*b-4*a*c;if(delta>=0)std::cout<<"Raizes: "<<(-b+sqrt(delta))/(2*a)<<" e "<<(-b-sqrt(delta))/(2*a)<<"\n";else std::cout<<"Sem raizes reais\n";return 0;}
