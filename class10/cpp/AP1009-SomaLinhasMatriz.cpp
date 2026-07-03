#include <iostream>
int main(){int m[3][3]={{1,2,3},{4,5,6},{7,8,9}};for(int i=0;i<3;i++){int s=0;for(int j=0;j<3;j++)s+=m[i][j];std::cout<<"Linha "<<i<<": "<<s<<"\n";}return 0;}
