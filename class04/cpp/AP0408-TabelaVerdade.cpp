#include <iostream>
int main(){bool v[2]={true,false};std::cout<<"A B | AeB | AouB\n";for(int i=0;i<2;i++)for(int j=0;j<2;j++){bool a=v[i],b=v[j];std::cout<<a<<" "<<b<<" | "<<(a&&b)<<"   | "<<(a||b)<<"\n";}return 0;}
