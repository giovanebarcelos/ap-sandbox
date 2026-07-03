#include <iostream>
#include <string>
int main(){std::string cpf="123.456.789-00";std::cout<<"CPF anonimizado: ***."<<cpf.substr(4,3)<<".***-**\n";return 0;}
