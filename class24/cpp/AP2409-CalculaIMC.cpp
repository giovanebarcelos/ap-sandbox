#include <iostream>
#include <iomanip>
double imc(double p,double a){return p/(a*a);}
int main(){std::cout<<std::fixed<<std::setprecision(1)<<"IMC: "<<imc(70,1.75)<<"\n";return 0;}
