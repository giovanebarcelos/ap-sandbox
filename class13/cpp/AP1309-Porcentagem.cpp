#include <iostream>
#include <iomanip>
int main(){double valor=200.0;int pct=15;std::cout<<std::fixed<<std::setprecision(2)<<pct<<"% de "<<valor<<" = "<<valor*pct/100<<"\n";return 0;}
