#include <iostream>
#include <iomanip>
int main(){double kmCarro=300,kwh=200,co2=kmCarro*0.12+kwh*0.09;std::cout<<std::fixed<<std::setprecision(1)<<"Pegada estimada: "<<co2<<" kg CO2/mes\n";return 0;}
