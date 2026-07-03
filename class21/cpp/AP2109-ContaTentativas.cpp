#include <iostream>
int main(){int secreto=42,palpites[4]={50,25,40,42},tent=0;for(int i=0;i<4;i++){tent++;if(palpites[i]==secreto)break;}std::cout<<"Acertou em "<<tent<<" tentativas\n";return 0;}
