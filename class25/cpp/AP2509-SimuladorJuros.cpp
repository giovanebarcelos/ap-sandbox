#include <iostream>
#include <iomanip>
#include <cmath>
int main(){double capital=1000,taxa=0.01;int meses=12;std::cout<<std::fixed<<std::setprecision(2)<<"Montante: "<<capital*pow(1+taxa,meses)<<"\n";return 0;}
